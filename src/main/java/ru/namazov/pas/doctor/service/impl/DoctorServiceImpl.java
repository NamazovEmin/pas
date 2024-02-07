package ru.namazov.pas.doctor.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ru.namazov.pas.doctor.entity.Doctor;
import ru.namazov.pas.doctor.repository.DoctorRepository;
import ru.namazov.pas.doctor.service.DoctorService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public Optional<Doctor> findByID(Long id) {
        return doctorRepository.findById(id);
    }

    @Override
    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
