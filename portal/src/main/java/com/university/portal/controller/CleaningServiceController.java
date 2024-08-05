package com.university.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.university.portal.model.CleaningService;
import com.university.portal.service.CleaningServiceService;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@RestController
public class CleaningServiceController {

    @Autowired
    CleaningServiceService cleaningService;

    @GetMapping("/cleaningservice")
    public List<CleaningService> index(){ return cleaningService.getAllCleaningService();}

    @GetMapping("/cleaningservice/{id}")
    public Optional<CleaningService> getCleaningService(@PathVariable Integer id)
    { return cleaningService.getCleaningService(id);}
}
