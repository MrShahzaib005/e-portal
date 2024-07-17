package com.university.portal.service.implement;

import com.university.portal.model.CleaningServices;
import com.university.portal.repository.CleaningServiceRepository;
import com.university.portal.service.CleaningServicesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CleaningServiceImpl implements CleaningServicesService {

    @Autowired
    CleaningServiceRepository cleaningServiceRepository;

    @Override
    public List<CleaningServices> getAllCleaningService() {
        return cleaningServiceRepository.findAll();
    }
}
