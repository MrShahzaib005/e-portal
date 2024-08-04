package com.university.portal.service.implement;

import com.university.portal.model.EventRequest;
import com.university.portal.repository.EventRequestRepository;
import com.university.portal.service.EventRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventRequestImpl implements EventRequestService {

    @Autowired
    EventRequestRepository eventRequestRepository;

    @Override
    public List<EventRequest> getAllEventRequest() {
        return eventRequestRepository.findAll();
    }
}
