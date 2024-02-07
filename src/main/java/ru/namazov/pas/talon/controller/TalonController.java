package ru.namazov.pas.talon.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.namazov.pas.talon.dto.EmptySlotsRequest;
import ru.namazov.pas.talon.dto.TalonDTO;
import ru.namazov.pas.talon.entity.Talon;
import ru.namazov.pas.talon.mapper.TalonMapper;
import ru.namazov.pas.talon.repository.TalonRepository;
import ru.namazov.pas.talon.service.TalonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/talon")
@AllArgsConstructor
public class TalonController {

    private final TalonService talonService;
    private final TalonMapper talonMapper;
    private final TalonRepository talonRepository;

    @GetMapping("/emptyslots")
    public ResponseEntity<List<TalonDTO>> getEmptyTalons(@RequestBody EmptySlotsRequest emptySlotsRequest) {
        List<Talon> emptySlots = talonService.getEmptySlotsByDoctorAndCurrentDate(emptySlotsRequest);
        List<TalonDTO> talonDTOS = talonMapper.toDTO(emptySlots);
        return ResponseEntity.ok(talonDTOS);
    }

    @GetMapping("/reserve")
    public ResponseEntity<TalonDTO> reserve(@RequestBody TalonDTO talonDTO) {
        Talon talon = talonMapper.toEntity(talonDTO);
        Talon reservedTalon = talonService.reserve(talon);
        TalonDTO reservedTalonDTO = talonMapper.toDTO(reservedTalon);
        return ResponseEntity.ok(reservedTalonDTO);
    }

    @GetMapping("/{patientID}")
    public ResponseEntity<List<TalonDTO>> getPatientsTalons(@PathVariable Long patientID) {
        List<Talon> talonList = talonService.getSlotsByPatientID(patientID);
        List<TalonDTO> talonDTOList = talonMapper.toDTO(talonList);
        return ResponseEntity.ok(talonDTOList);
    }
}
