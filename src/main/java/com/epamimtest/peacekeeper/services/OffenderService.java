package com.epamimtest.peacekeeper.services;

import com.epamimtest.peacekeeper.models.Offender;

import java.util.List;
import java.util.Optional;

public interface OffenderService {
    Optional<Offender> findOffenderById(Long id);

    List<Offender> findOffenderByName(String name);

    List<Offender> findOffenderByNameContaining(String name);

    void saveOffender(Offender offender);

    void updateOffender(Offender offender);

    void deleteOffenderById(Long id);

    void deleteAllOffenders();

    List<Offender> findAllOffenders();

    boolean isOffenderExist(Offender offender);
}
