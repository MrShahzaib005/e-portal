package com.university.portal.service.implement;

import com.university.portal.model.MeetingLocation;
import com.university.portal.repository.MeetingLocationRepository;
import com.university.portal.service.MeetingLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingLocationImpl implements MeetingLocationService {
    @Autowired
    MeetingLocationRepository meetingLocationRepository;

    @Override
    public List<MeetingLocation> getAllMeetingLocation() {
        return meetingLocationRepository.findAll();
    }
}
