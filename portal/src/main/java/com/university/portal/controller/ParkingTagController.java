package com.university.portal.controller;

import com.university.portal.model.ParkingTag;
import com.university.portal.service.ParkingTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class ParkingTagController {
    @Autowired
    ParkingTagService parkingTagService;

    @GetMapping("/parkingtag")
    public List<ParkingTag> index() { return parkingTagService.getAllParkingTag(); }

    @GetMapping("/parkingtag/{id}")
    public Optional<ParkingTag> getParkingTag(@PathVariable Integer id) { return parkingTagService.getParkingTag(id); }
}
