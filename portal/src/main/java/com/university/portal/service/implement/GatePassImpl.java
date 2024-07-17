package com.university.portal.service.implement;

import com.university.portal.repository.GatePassRepository;
import com.university.portal.service.GatePassService;
import org.springframework.beans.factory.annotation.Autowired;

public class GatePassImpl implements GatePassService {

    @Autowired
    GatePassRepository gatePassRepository;
}
