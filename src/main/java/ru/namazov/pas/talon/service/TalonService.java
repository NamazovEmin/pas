package ru.namazov.pas.talon.service;

import java.util.List;

import ru.namazov.pas.talon.controller.soap.ScheduleXML;
import ru.namazov.pas.talon.dto.EmptySlotsRequest;
import ru.namazov.pas.talon.entity.Talon;

public interface TalonService {

   List<Talon> getEmptySlotsByDoctorAndCurrentDate(EmptySlotsRequest emptySlotsRequest);

   Talon reserve(Talon talon);

    List<Talon> getSlotsByPatientID(Long patientID);

    List<Talon> buildSchedule(List<ScheduleXML> scheduleList);
}
