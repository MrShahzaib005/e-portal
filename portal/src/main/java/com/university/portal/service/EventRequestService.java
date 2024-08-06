package com.university.portal.service;

import com.university.portal.model.EventRequest;

import java.util.List;
import java.util.Optional;

public interface EventRequestService {
    public List<EventRequest> getAllEventRequest();

    public Optional<EventRequest> getEventRequest(Integer eventrequestid);

    public EventRequest create(EventRequest eventRequest);
}
