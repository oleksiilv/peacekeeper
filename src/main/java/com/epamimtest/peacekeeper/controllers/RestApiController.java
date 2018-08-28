package com.epamimtest.peacekeeper.controllers;

import com.epamimtest.peacekeeper.models.Offender;
import com.epamimtest.peacekeeper.services.OffenderService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	OffenderService offenderService;

	@RequestMapping(value = "/offender/", method = RequestMethod.GET)
	public ResponseEntity<List<Offender>> listAllOffenders() {
		List<Offender> offenders = offenderService.findAllOffenders();
		if (offenders.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Offender>>(offenders, HttpStatus.OK);
	}

	@RequestMapping(value = "/offender/", method = RequestMethod.POST)
	public ResponseEntity<?> createOffender(@RequestBody Offender offender, UriComponentsBuilder ucBuilder) {
		logger.info("Creating Offender : {}", offender);

		offenderService.saveOffender(offender);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/offender/{id}").buildAndExpand(offender.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

}