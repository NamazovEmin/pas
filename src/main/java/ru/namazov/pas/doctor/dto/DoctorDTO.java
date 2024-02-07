package ru.namazov.pas.doctor.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DoctorDTO {

    private Long id;

    private String uuID;

    private String fullName;
}
