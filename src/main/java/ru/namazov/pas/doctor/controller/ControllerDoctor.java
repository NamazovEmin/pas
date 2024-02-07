/*
 * Copyright (c) 2024, TopS BI LLC. All rights reserved.
 * http://www.topsbi.ru
 */

/*
 * Copyright (c) 2024, TopS BI LLC. All rights reserved.
 * http://www.topsbi.ru
 */

package ru.namazov.pas.doctor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.namazov.pas.doctor.dto.DoctorDTO;
import ru.namazov.pas.doctor.entity.Doctor;
import ru.namazov.pas.doctor.mapper.DoctorMapper;
import ru.namazov.pas.doctor.service.DoctorService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/doctor")
public class ControllerDoctor {

    private final DoctorService doctorService;
    private final DoctorMapper doctorMapper;

    @PostMapping
    public ResponseEntity<DoctorDTO> save(@RequestBody DoctorDTO doctorDTO) {
        Doctor doctor = doctorMapper.toEntity(doctorDTO);
        Doctor savedDoctor = doctorService.save(doctor);
        DoctorDTO response = doctorMapper.toDTO(savedDoctor);
        return ResponseEntity.ok(response);
    }
}
