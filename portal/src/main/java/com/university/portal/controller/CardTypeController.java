package com.university.portal.controller;

import com.university.portal.model.Assets;
import com.university.portal.model.CardType;
import com.university.portal.service.implement.CardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CardTypeController {

    @Autowired
    CardTypeService cardTypeService;

    @GetMapping("/cardType")
    public List<CardType> index(){
        return cardTypeService.getAllCardType();
    }

    @PostMapping("/cardType/store")
    public CardType saveCardType(@RequestBody CardType cardType){
        return cardTypeService.create(cardType);
    }

    @DeleteMapping("/cardType/delete/{id}")
    public ResponseEntity<Void> deleteCardType(@PathVariable Integer id) {
        cardTypeService.deleteCardType(id);
        return ResponseEntity.noContent().build();}

    @PostMapping("/cardType/update")
    public CardType updatecardType(@RequestBody CardType cardType){
        return cardTypeService.update(cardType);
    }

    @GetMapping("/cardType/{id}")
    public Optional<CardType> getCardType(@PathVariable Integer id){return cardTypeService.getCardType(id);}

}
