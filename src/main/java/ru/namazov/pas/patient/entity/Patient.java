/*
 * Copyright (c) 2024, TopS BI LLC. All rights reserved.
 * http://www.topsbi.ru
 */

/*
 * Copyright (c) 2024, TopS BI LLC. All rights reserved.
 * http://www.topsbi.ru
 */

package ru.namazov.pas.patient.entity;

import java.util.Date;
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
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_seq")
    @SequenceGenerator(name="patient_seq", sequenceName = "sequence_patients_id", allocationSize = 2, initialValue = 10)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "uuid")
    private String uuID;

    @Column(name = "fullname")
    private String FullName;

    @Column(name = "birthdate")
    private Date birthDate;

    @PrePersist
    public void initializeUUID() {
        if (uuID == null) {
            uuID = UUID.randomUUID().toString();
        }
    }
}
