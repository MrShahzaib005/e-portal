package com.university.portal.controller;

import com.university.portal.model.MeetingRoom;
import com.university.portal.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class MeetingRoomController {
    @Autowired
    MeetingRoomService meetingRoomService;

    @GetMapping("/meetingroom")
    public List<MeetingRoom> index() { return meetingRoomService.getAllMeetingRoom(); }

    @GetMapping("/meetingroom/{id}")
    public Optional<MeetingRoom> getMeetingRoom(@PathVariable Integer id) { return meetingRoomService.getMeetingRoom(id); }
}
