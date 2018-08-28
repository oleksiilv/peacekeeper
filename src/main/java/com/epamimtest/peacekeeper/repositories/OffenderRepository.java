package com.epamimtest.peacekeeper.repositories;

import com.epamimtest.peacekeeper.models.Offender;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OffenderRepository extends CrudRepository<Offender, Long> {
    List<Offender> findByName(String name);
    List<Offender> findByNameContaining(String name);
}
