package ru.namazov.pas.talon.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.namazov.pas.talon.entity.Talon;

@Repository
public interface TalonRepository extends JpaRepository<Talon, Long> {

    List<Talon> findAllByDoctorIdAndStartReception(Long doctorID, LocalDateTime startReception);

    List<Talon> findAllByPatientId(Long patientID);
}
