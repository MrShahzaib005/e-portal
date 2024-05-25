package com.university.portal.controller;

import com.university.portal.model.CardType;
import com.university.portal.service.implement.CardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardTypeController {

    @Autowired
    CardTypeService cardTypeService;

    @GetMapping("/cardType")
    public String index(){return "hello world from card_type controller";}

    @PostMapping("/cardType/store")
    public CardType saveCardType(@RequestBody CardType cardType){
        return cardTypeService.create(cardType);
    }
}
