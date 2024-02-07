package ru.namazov.pas.doctor.service;

import java.util.Optional;

import ru.namazov.pas.doctor.entity.Doctor;

public interface DoctorService {

    Optional<Doctor> findByID(Long id);

    Doctor save(Doctor doctor);
}
