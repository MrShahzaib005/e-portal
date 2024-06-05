package com.university.portal.service.implement;

import com.university.portal.model.CardType;

import java.util.List;

public interface CardTypeService {

    public CardType create(CardType cardType);

    public List<CardType> getAllCardType();
}
