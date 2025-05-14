package com.university.portal.controller;

import com.university.portal.model.GatePass;
import com.university.portal.service.GatePassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericApplicationContextExtensionsKt;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class GatePassController {

    @Autowired
    GatePassService gatePassService;

    @GetMapping("/gatepass")
    public List<GatePass> index() { return gatePassService.getAllGatePass(); }

    @GetMapping("/gatepass/{id}")
    public Optional<GatePass> getGatePass(@PathVariable Integer id) { return gatePassService.getGatePass(id); }
}
