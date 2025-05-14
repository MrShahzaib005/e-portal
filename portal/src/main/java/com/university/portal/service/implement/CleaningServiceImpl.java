package com.university.portal.service.implement;

import com.university.portal.model.CleaningService;
import com.university.portal.repository.CleaningServiceRepository;
import com.university.portal.service.CleaningServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CleaningServiceImpl implements CleaningServiceService {

    @Autowired
    CleaningServiceRepository cleaningServiceRepository;

    @Override
    public List<CleaningService> getAllCleaningService() {
        return cleaningServiceRepository.findAll();
    }

    @Override
    public Optional<CleaningService> getCleaningService(Integer cleaningserviceid) {
        return cleaningServiceRepository.findById(cleaningserviceid);
    }

    @Override
    public CleaningService create(CleaningService cleaningservice) {
        return cleaningServiceRepository.save(cleaningservice);
    }

    @Override
    public CleaningService update(CleaningService cleaningservice) {
        return cleaningServiceRepository.save(cleaningservice);
    }

    @Override
    public void deleteAllEntities() {
        cleaningServiceRepository.deleteAll();
    }
}
