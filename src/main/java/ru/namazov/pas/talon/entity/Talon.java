package ru.namazov.pas.talon.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

import ru.namazov.pas.doctor.entity.Doctor;
import ru.namazov.pas.patient.entity.Patient;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "talons")
public class Talon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "talon_seq")
    @SequenceGenerator(name="talon_seq", sequenceName = "sequence_talons_id", allocationSize = 2, initialValue = 10)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "uuid", unique = true)
    private String uuID;

    @OneToOne()
    @JoinColumn(name = "doctors_id", referencedColumnName = "id")
    private Doctor doctor;

    @OneToOne()
    @JoinColumn(name = "patients_id", referencedColumnName = "id")
    private Patient patient;

    @DateTimeFormat
    @Column(name = "start_reception")
    private LocalDateTime startReception;

    @PrePersist
    public void initializeUUID() {
        if (uuID == null) {
            uuID = UUID.randomUUID().toString();
        }
    }
}
