package ru.namazov.pas.talon.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class EmptySlotsRequest {

    private Long doctorID;

    private Date currentDate;
}
