package com.university.portal.controller;

import com.university.portal.model.EventRequest;
import com.university.portal.service.EventRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EventRequestController {

    @Autowired
    EventRequestService eventRequestService;

    @GetMapping("/eventrequest")
    public List<EventRequest> index(){ return eventRequestService.getAllEventRequest();}
}
