/*
 * Copyright (c) 2024, TopS BI LLC. All rights reserved.
 * http://www.topsbi.ru
 */

package ru.namazov.pas.talon.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.namazov.pas.talon.entity.Talon;

@Repository
public interface TalonRepository extends JpaRepository<Talon, Long> {

    List<Talon> findAllByDoctorIdAndStartReception(Long doctorID, Date startReception);

    List<Talon> findAllByPatientId(Long patientID);
}
