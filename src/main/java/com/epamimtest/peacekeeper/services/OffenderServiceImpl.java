package com.epamimtest.peacekeeper.services;

import com.epamimtest.peacekeeper.models.Offender;
import com.epamimtest.peacekeeper.repositories.OffenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("offenderService")
public class OffenderServiceImpl implements OffenderService {

    @Autowired
    private OffenderRepository offenderRepository;

    @Override
    public Optional<Offender> findOffenderById(Long id) {
        return offenderRepository.findById(id);
    }

    @Override
    public List<Offender> findOffenderByName(String name) {
        return offenderRepository.findByName(name);
    }

    @Override
    public List<Offender> findOffenderByNameContaining(String name) {
        return offenderRepository.findByNameContaining(name);
    }

    @Override
    public void saveOffender(Offender offender) {
        offenderRepository.save(offender);
    }

    @Override
    public void updateOffender(Offender offender) {
        this.saveOffender(offender);
    }

    @Override
    public void deleteOffenderById(Long id) {
        offenderRepository.deleteById(id);
    }

    @Override
    public void deleteAllOffenders() {
        offenderRepository.deleteAll();
    }

    @Override
    public List<Offender> findAllOffenders() {
        return (List<Offender>) offenderRepository.findAll();
    }

    @Override
    public boolean isOffenderExist(Offender offender) {
        return !this.findOffenderByName(offender.getName()).isEmpty();
    }
}
