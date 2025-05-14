package com.university.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.university.portal.model.CleaningService;
import com.university.portal.service.CleaningServiceService;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class CleaningServiceController {

    @Autowired
    CleaningServiceService cleaningService;

    @GetMapping("/cleaningservice")
    public List<CleaningService> index() {
        return cleaningService.getAllCleaningService(); }

    @GetMapping("/cleaningservice/{id}")
    public Optional<CleaningService> getCleaningService(@PathVariable Integer id) {
        return cleaningService.getCleaningService(id); }

    @PostMapping("/cleaningservice/store")
    public CleaningService savecleaningservice(@RequestBody CleaningService cleaningservice) {
        return cleaningService.create(cleaningservice); }

    @PostMapping("/cleaningservice/update")
    public CleaningService updatecleaningservice(@RequestBody CleaningService cleaningservice) {
        return cleaningService.update(cleaningservice);
    }

    @DeleteMapping("/cleaningservice/delete")
    public ResponseEntity<Void> deleteAllEntities() {
        cleaningService.deleteAllEntities();
        return ResponseEntity.noContent().build();
    }
}
