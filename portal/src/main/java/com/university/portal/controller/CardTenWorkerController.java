package com.university.portal.controller;

import com.university.portal.model.CardTenWorker;
import com.university.portal.service.CardTenWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class CardTenWorkerController {

    @Autowired
    CardTenWorkerService cardTenWorkerService;

    @PostMapping("/cardtenworker/store")
    public CardTenWorker saveDetail(@RequestBody CardTenWorker cardTenWorker) {
        return cardTenWorkerService.save(cardTenWorker); }

    @PostMapping("cardtenworker/update")
    public CardTenWorker updateDetail(@RequestBody CardTenWorker cardTenWorker) {
        return cardTenWorkerService.update(cardTenWorker); }

    @GetMapping("/cardtenworker")
    public List<CardTenWorker> index() {
        return cardTenWorkerService.getAllCarTenWorker(); }

    @GetMapping("/cardtenworker/{id}")
    public Optional<CardTenWorker> getCardTenWorker(@PathVariable Integer id) {
        return cardTenWorkerService.getCardTenWorker(id); }

    @DeleteMapping("/cardtenworker/delete")
    public ResponseEntity<Void> deleteAllEntities() {
        cardTenWorkerService.deleteAllEntities();
        return ResponseEntity.noContent().build();
    }

    //Error 405
    @DeleteMapping("/cardtenworker/delete/{id}")
    public ResponseEntity<Void> deleteCardTenWorker(@PathVariable Integer id) {
        cardTenWorkerService.deleteCardTenWorker(id);
        return ResponseEntity.noContent().build();
    }
}
