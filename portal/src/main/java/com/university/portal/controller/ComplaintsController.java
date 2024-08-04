package com.university.portal.controller;

import com.university.portal.model.Complaints;
import com.university.portal.service.ComplaintsService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComplaintsController {

    @Autowired
    ComplaintsService complaintsService;

    @GetMapping("/complaints")
    public List<Complaints> index(){ return complaintsService.getAllComplaints();}
}
