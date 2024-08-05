package com.university.portal.service;

import com.university.portal.model.CleaningService;
import java.util.List;
import java.util.Optional;

public interface CleaningServiceService {
    public List<CleaningService> getAllCleaningService();

    public Optional<CleaningService> getCleaningService(Integer cleaningserviceid);
}
