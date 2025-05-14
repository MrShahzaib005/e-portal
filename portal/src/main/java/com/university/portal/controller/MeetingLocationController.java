package com.university.portal.controller;

import com.university.portal.model.MeetingLocation;
import com.university.portal.repository.MeetingLocationRepository;
import com.university.portal.service.MeetingLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.ListQueryByExampleExecutor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class MeetingLocationController {
    @Autowired
    MeetingLocationService meetingLocationService;

    @GetMapping("/meetinglocation")
    public List<MeetingLocation> index() { return meetingLocationService.getAllMeetingLocation(); }

    @GetMapping("/meetinglocation/{id}")
    public Optional<MeetingLocation> getMeetingLocation(@PathVariable Integer id) { return meetingLocationService.getMeetingLocation(id); }
}
