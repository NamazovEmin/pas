package ru.namazov.pas.doctor.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctor_seq")
    @SequenceGenerator(name="doctor_seq", sequenceName = "sequence_doctors_id", allocationSize = 2, initialValue = 10)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "uuid", unique = true)
    private String uuID;

    @Column(name = "fullname")
    private String fullName;

    @PrePersist
    public void initializeUUID() {
        if (uuID == null) {
            uuID = UUID.randomUUID().toString();
        }
    }
}
