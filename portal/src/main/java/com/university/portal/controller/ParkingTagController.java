package com.university.portal.controller;

import com.university.portal.model.ParkingTag;
import com.university.portal.service.ParkingTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingTagController {
    @Autowired
    ParkingTagService parkingTagService;

    @GetMapping("/parkingtag")
    public List<ParkingTag> index(){ return parkingTagService.getAllParkingTag();}
}
