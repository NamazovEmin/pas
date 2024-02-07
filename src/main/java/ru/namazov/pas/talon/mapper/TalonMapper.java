package ru.namazov.pas.talon.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import ru.namazov.pas.talon.controller.soap.TalonXML;
import ru.namazov.pas.talon.dto.TalonDTO;
import ru.namazov.pas.talon.entity.Talon;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TalonMapper {

    TalonDTO toDTO(Talon talon);

    Talon toEntity(TalonDTO talonDTO);

    List<TalonDTO> toDTO(List<Talon> talonList);

    List<TalonXML> toXML(List<Talon> talonList);

    @Mapping(target = "doctor", source = "doctor")
    @Mapping(target = "patient", source = "patient")
    TalonXML toXML(Talon talon);
}
