package com.university.portal.controller;
import com.university.portal.model.CardTenantWorker;
import com.university.portal.service.CardTenantWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CardTenantWorkerController {
    @Autowired
    CardTenantWorkerService cardTenantWorkerService;

    @GetMapping("/cardtenantwokre")
    public List<CardTenantWorker> index(){
        return cardTenantWorkerService.getAllCardTenantWorker();
    }
}
