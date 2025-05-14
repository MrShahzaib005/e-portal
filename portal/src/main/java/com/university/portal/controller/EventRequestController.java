package com.university.portal.controller;

import com.university.portal.model.EventRequest;
import com.university.portal.model.NewsEvent;
import com.university.portal.service.EventRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class EventRequestController {

    @Autowired
    EventRequestService eventRequestService;

    @GetMapping("/eventrequest")
    public List<EventRequest> index() { return eventRequestService.getAllEventRequest(); }

    @GetMapping("/eventrequest/{id}")
    public Optional<EventRequest> getEventRequest(@PathVariable Integer id)
    { return eventRequestService.getEventRequest(id); }

    @PostMapping("/eventrequest/store")
    public EventRequest savenewseventrequest(@RequestBody EventRequest eventRequest)
    { return eventRequestService.create(eventRequest); }
}
