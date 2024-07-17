package com.university.portal.controller;
import com.university.portal.model.Complaints;
import com.university.portal.service.ComplaintsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ComplaintsController {
    ComplaintsService complaintsService;

    @GetMapping("/complaints")
    public List<Complaints> index() { return complaintsService.getAllComlpaints();}
}
