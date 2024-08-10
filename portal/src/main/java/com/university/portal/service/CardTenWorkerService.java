package com.university.portal.service;

import com.university.portal.model.CardTenWorker;
import java.util.List;
import java.util.Optional;

public interface CardTenWorkerService {

    public CardTenWorker save(CardTenWorker cardTenWorker);

    public List<CardTenWorker> getAllCarTenWorker();

    public Optional<CardTenWorker> getCardTenWorker(Integer cardtenworkerid);

    public CardTenWorker update(CardTenWorker cardTenWorker);

}
