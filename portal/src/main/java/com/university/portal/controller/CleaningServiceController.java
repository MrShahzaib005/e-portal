package com.university.portal.controller;
import com.university.portal.model.CleaningServices;
import com.university.portal.service.CleaningServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CleaningServiceController {
    @Autowired
    CleaningServicesService cleaningServicesService;

    @GetMapping("/cleaningservice")
    public List<CleaningServices> index() { return cleaningServicesService.getAllCleaningService();}
}
