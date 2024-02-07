

package ru.namazov.pas.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.namazov.pas.patient.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
