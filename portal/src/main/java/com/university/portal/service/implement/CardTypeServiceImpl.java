package com.university.portal.service.implement;

import com.university.portal.model.CardType;
import com.university.portal.repository.CardTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardTypeServiceImpl implements CardTypeService{

    @Autowired
    CardTypeRepository cardTypeRepository;


    @Override
    public CardType create(CardType cardType) {
        return cardTypeRepository.save(cardType);
    }

    @Override
    public List<CardType> getAllCardType() {
        return cardTypeRepository.findAll();
    }
}
