/*
 * Copyright (c) 2024, TopS BI LLC. All rights reserved.
 * http://www.topsbi.ru
 */

package ru.namazov.pas.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.namazov.pas.doctor.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
