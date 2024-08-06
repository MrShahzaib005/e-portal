package com.university.portal.controller;

import com.university.portal.model.PettyCash;
import com.university.portal.service.PettyCashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PettyCashController {

    @Autowired
    PettyCashService pettyCashService;

    @PostMapping("/pettycash/store")
    public PettyCash savepettycash(@RequestBody PettyCash pettyCash) { return pettyCashService.create(pettyCash); }

    @GetMapping("/pettycash")
    public List<PettyCash> index() { return pettyCashService.getAllPettyCash(); }

    @GetMapping("/pettycash/{id}")
    public Optional<PettyCash> getPettyCash(@PathVariable Integer id) { return pettyCashService.getPettyCash(id); }
}
