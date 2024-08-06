package com.university.portal.service;

import com.university.portal.model.MeetingRoom;

import java.util.List;
import java.util.Optional;

public interface MeetingRoomService {
    public List<MeetingRoom> getAllMeetingRoom();

    public Optional<MeetingRoom> getMeetingRoom(Integer meetingroomid);
}
