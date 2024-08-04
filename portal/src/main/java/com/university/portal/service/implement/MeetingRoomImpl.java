package com.university.portal.service.implement;

import com.university.portal.model.MeetingRoom;
import com.university.portal.repository.MeetingRoomRepository;
import com.university.portal.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class MeetingRoomImpl implements MeetingRoomService {
    @Autowired
    MeetingRoomRepository meetingRoomRepository;

    @Override
    public List<MeetingRoom> getAllMeetingRoom() {
        return meetingRoomRepository.findAll();
    }
}
