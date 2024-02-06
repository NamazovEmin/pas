/*
 * Copyright (c) 2024, TopS BI LLC. All rights reserved.
 * http://www.topsbi.ru
 */

package ru.namazov.pas.talon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ru.namazov.pas.talon.dto.EmptySlotsRequest;
import ru.namazov.pas.talon.entity.Talon;
import ru.namazov.pas.talon.repository.TalonRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TalonServiceImpl implements TalonService {

    private final TalonRepository talonRepository;

    @Override
    public List<Talon> getEmptySlotsByDoctorAndCurrentDate(EmptySlotsRequest emptySlotsRequest) {
        return talonRepository.findAllByDoctorIdAndStartReception(emptySlotsRequest.getDoctorID(), emptySlotsRequest.getCurrentDate());
    }

    @Override
    public Talon reserve(Talon talon) {
        Talon byId = talonRepository.findById(talon.getId()).orElseThrow();
        if (byId.getPatient() != null) {
            throw new RuntimeException();
        }
        byId.setPatient(talon.getPatient());
        Talon reservedTalon = talonRepository.save(byId);
        return reservedTalon;
    }

    @Override
    public List<Talon> getSlotsByPatientID(Long patientID) {
        return talonRepository.findAllByPatientId(patientID);
    }
}
