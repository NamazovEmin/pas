package ru.namazov.pas.talon.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class EmptySlotsRequest {

    private Long doctorID;

    private LocalDateTime currentDate;
}
