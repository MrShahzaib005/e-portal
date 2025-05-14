package com.university.portal.controller;

import com.university.portal.model.Complaints;
import com.university.portal.service.ComplaintsService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class ComplaintsController {

    @Autowired
    ComplaintsService complaintsService;

    @GetMapping("/complaints")
    public List<Complaints> index() { return complaintsService.getAllComplaints(); }

    @GetMapping("/complaints/{id}")
    public Optional<Complaints> getComplaints(@PathVariable Integer id) { return complaintsService.getComplaints(id); }

    @PostMapping("/complaints/store")
    public Complaints savecomplaints(@RequestBody Complaints complaints) { return complaintsService.create(complaints); }
}
