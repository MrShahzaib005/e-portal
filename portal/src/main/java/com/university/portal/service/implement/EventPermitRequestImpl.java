package com.university.portal.service.implement;

import com.university.portal.repository.EventPermitRequestRepository;
import com.university.portal.service.EventPermitRequestService;
import org.springframework.beans.factory.annotation.Autowired;

public class EventPermitRequestImpl implements EventPermitRequestService {

    @Autowired
    EventPermitRequestRepository eventPermitRequestRepository;
}
