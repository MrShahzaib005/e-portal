package com.university.portal.service.implement;

import com.university.portal.model.CardType;

import java.util.List;
import java.util.Optional;

public interface CardTypeService {

    public CardType create(CardType cardType);

    public List<CardType> getAllCardType();

    public void deleteCardType(Integer cardTypeId);

    public CardType update(CardType cardType);

    public Optional<CardType> getCardType(Integer cardTypeId);
}
