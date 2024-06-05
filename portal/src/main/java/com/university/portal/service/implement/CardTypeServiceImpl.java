package com.university.portal.service.implement;

import com.university.portal.model.CardType;
import com.university.portal.repository.CardTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void deleteCardType(Integer cardTypeId) {
        cardTypeRepository.deleteById(cardTypeId);
    }

    public CardType update(CardType cardType){return cardTypeRepository.save(cardType);}

    @Override
    public Optional<CardType> getCardType(Integer cardTypeId) {
        return cardTypeRepository.findById(cardTypeId);
    }
}
