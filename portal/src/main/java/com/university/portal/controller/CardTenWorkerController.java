package com.university.portal.controller;

import com.university.portal.model.CardTenWorker;
import com.university.portal.service.CardTenWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CardTenWorkerController {

    @Autowired
    CardTenWorkerService cardTenWorkerService;

    @PostMapping("/cardtenworker/store")
    public CardTenWorker saveDetail(@RequestBody CardTenWorker cardTenWorker) {return cardTenWorkerService.save(cardTenWorker);}
}
