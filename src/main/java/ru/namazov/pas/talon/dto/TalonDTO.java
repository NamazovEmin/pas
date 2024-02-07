package ru.namazov.pas.talon.dto;

import java.util.Date;

import ru.namazov.pas.doctor.entity.Doctor;
import ru.namazov.pas.patient.entity.Patient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TalonDTO {

    private Long id;

    private Doctor doctor;

    private Patient patient;

    private Date startReception;
}
