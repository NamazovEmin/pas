/*
 * Copyright (c) 2024, TopS BI LLC. All rights reserved.
 * http://www.topsbi.ru
 */

package ru.namazov.pas.doctor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.namazov.pas.doctor.entity.Doctor;
import ru.namazov.pas.doctor.repository.DoctorRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/doctor")
public class ControllerDoctor {

    private final DoctorRepository doctorRepository;

    @PostMapping
    public ResponseEntity<Doctor> save() {
        Doctor doctor = new Doctor();
        doctor.setFullName("Emin");
        return ResponseEntity.ok(doctorRepository.save(doctor));
    }
}
