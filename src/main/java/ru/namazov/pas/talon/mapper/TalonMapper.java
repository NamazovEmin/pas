package ru.namazov.pas.talon.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import ru.namazov.pas.talon.dto.TalonDTO;
import ru.namazov.pas.talon.entity.Talon;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TalonMapper {

    TalonDTO toDTO(Talon talon);

    Talon toEntity(TalonDTO talonDTO);

    List<TalonDTO> toDTO(List<Talon> talonList);
}
