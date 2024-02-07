package ru.namazov.pas.talon.controller;

import java.util.List;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ru.namazov.pas.talon.controller.soap.GetScheduleRequest;
import ru.namazov.pas.talon.controller.soap.GetScheduleResponse;
import ru.namazov.pas.talon.controller.soap.ScheduleXML;
import ru.namazov.pas.talon.controller.soap.TalonXML;
import ru.namazov.pas.talon.entity.Talon;
import ru.namazov.pas.talon.mapper.TalonMapper;
import ru.namazov.pas.talon.service.TalonService;

import lombok.AllArgsConstructor;

@Endpoint
@AllArgsConstructor
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "http://www.namazov.ru/pas/talon/controller/soap";
    private final TalonService talonService;
    private final TalonMapper talonMapper;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getScheduleRequest")
    @ResponsePayload
    public GetScheduleResponse getTalons(@RequestPayload GetScheduleRequest request) {
        List<ScheduleXML> scheduleList = request.getScheduleList();
        List<Talon> talonList = talonService.buildSchedule(scheduleList);
        List<TalonXML> talonXMLS = talonMapper.toXML(talonList);
        GetScheduleResponse response = new GetScheduleResponse();
        response.getTalonList().addAll(talonXMLS);
        return response;
    }
}