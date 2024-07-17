package com.university.portal.service.implement;

import com.university.portal.repository.MeetingRoomRepository;
import com.university.portal.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;

public class MeetingRoomImpl implements MeetingRoomService {

    @Autowired
    MeetingRoomRepository meetingRoomRepository;
}
