package ru.namazov.pas.talon.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ru.namazov.pas.doctor.entity.Doctor;
import ru.namazov.pas.doctor.service.DoctorService;
import ru.namazov.pas.exceptions.IllegalArgumentException;
import ru.namazov.pas.exceptions.NotFoundException;
import ru.namazov.pas.talon.controller.soap.ScheduleXML;
import ru.namazov.pas.talon.dto.EmptySlotsRequest;
import ru.namazov.pas.talon.entity.Talon;
import ru.namazov.pas.talon.repository.TalonRepository;
import ru.namazov.pas.talon.service.TalonService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TalonServiceImpl implements TalonService {

    private final TalonRepository talonRepository;
    private final DoctorService doctorService;

    @Override
    public List<Talon> getEmptySlotsByDoctorAndCurrentDate(EmptySlotsRequest emptySlotsRequest) {
        return talonRepository.findAllByDoctorIdAndStartReception(emptySlotsRequest.getDoctorID(), emptySlotsRequest.getCurrentDate());
    }

    @Override
    public Talon reserve(Talon talon) {
        Talon byId = talonRepository.findById(talon.getId()).orElseThrow(() -> new NotFoundException("Данного слота не существует"));
        if (byId.getPatient() != null) {
            throw new IllegalArgumentException("Слот уже забронирован другим пациентом");
        }
        byId.setPatient(talon.getPatient());
        return talonRepository.save(byId);
    }

    @Override
    public List<Talon> getSlotsByPatientID(Long patientID) {
        return talonRepository.findAllByPatientId(patientID);
    }

    @Override
    public List<Talon> buildSchedule(List<ScheduleXML> scheduleList) {
        List<Talon> talonsPerDay = new ArrayList<>();
        List<Talon> all = new ArrayList<>();
        scheduleList.forEach(schedule -> {
            long doctorID = schedule.getDoctorID();
            if(doctorService.findByID(doctorID).isPresent()) {
                Doctor doctor = doctorService.findByID(doctorID).get();
                int slotsCountPerDay = schedule.getSlotsCountPerDay();

                LocalDate scheduleStart = LocalDate.of(schedule.getScheduleStart().getYear(), schedule.getScheduleStart().getMonth(), schedule.getScheduleStart().getDay());
                LocalDate scheduleEnd = LocalDate.of(schedule.getScheduleEnd().getYear(), schedule.getScheduleEnd().getMonth(), schedule.getScheduleEnd().getDay()).plusDays(1);
                int slotsTimeDuration = schedule.getSlotsTimeDuration();
                while (scheduleEnd.isAfter(scheduleStart)) {
                    LocalTime dayStart = LocalTime.of(schedule.getDayStart().getHour(), 0);
                    LocalTime dayEnd = LocalTime.of(schedule.getDayEnd().getHour(), 0).plusHours(1);
                    while (dayEnd.isAfter(dayStart)) {
                        if (talonsPerDay.size() < slotsCountPerDay && dayEnd.isAfter(dayStart.plusHours(slotsTimeDuration))) {
                            Talon talon = new Talon();
                            talon.setDoctor(doctor);
                            talon.setStartReception(LocalDateTime.of(scheduleStart, dayStart));
                            Talon saved = talonRepository.save(talon);
                            talonsPerDay.add(saved);
                        }
                        dayStart = dayStart.plusHours(slotsTimeDuration);
                    }

                    scheduleStart = scheduleStart.plusDays(1);
                    all.addAll(talonsPerDay);
                    talonsPerDay.clear();
                }
            }
        });
        return all;
    }
}
