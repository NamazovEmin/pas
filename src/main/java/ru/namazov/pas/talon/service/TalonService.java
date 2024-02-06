/*
 * Copyright (c) 2024, TopS BI LLC. All rights reserved.
 * http://www.topsbi.ru
 */

package ru.namazov.pas.talon.service;

import java.util.List;

import ru.namazov.pas.talon.dto.EmptySlotsRequest;
import ru.namazov.pas.talon.entity.Talon;

public interface TalonService {

   List<Talon> getEmptySlotsByDoctorAndCurrentDate(EmptySlotsRequest emptySlotsRequest);

   Talon reserve(Talon talon);

    List<Talon> getSlotsByPatientID(Long patientID);
}
