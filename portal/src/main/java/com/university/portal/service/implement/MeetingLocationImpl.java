package com.university.portal.service.implement;

import com.university.portal.repository.MeetingLocationRepository;
import com.university.portal.service.MeetingLocationService;
import org.springframework.beans.factory.annotation.Autowired;

public class MeetingLocationImpl implements MeetingLocationService {

    @Autowired
    MeetingLocationRepository meetingLocationRepository;
}
