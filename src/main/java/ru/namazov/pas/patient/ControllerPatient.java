/*
 * Copyright (c) 2024, TopS BI LLC. All rights reserved.
 * http://www.topsbi.ru
 */

package ru.namazov.pas.patient;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.namazov.pas.patient.entity.Patient;
import ru.namazov.pas.patient.repository.PatientRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/patient")
public class ControllerPatient {

    private final PatientRepository patientRepository;

    @PostMapping
    public ResponseEntity<Patient> save() {
        Patient patient = new Patient();
        patient.setFullName("Emin");
        patient.setBirthDate(new Date());
        return ResponseEntity.ok(patientRepository.save(patient));
    }
}
