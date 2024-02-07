package ru.namazov.pas.doctor.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import ru.namazov.pas.doctor.dto.DoctorDTO;
import ru.namazov.pas.doctor.entity.Doctor;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DoctorMapper {

    DoctorDTO toDTO(Doctor doctor);

    Doctor toEntity(DoctorDTO doctorDTO);
}
