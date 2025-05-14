package com.university.portal.service;

import com.university.portal.model.CardTenWorker;
import java.util.List;
import java.util.Optional;

public interface CardTenWorkerService {

    public CardTenWorker save(CardTenWorker cardTenWorker);

    public List<CardTenWorker> getAllCarTenWorker();

    public Optional<CardTenWorker> getCardTenWorker(Integer cardTenWorkerId);

    public CardTenWorker update(CardTenWorker cardTenWorker);

    public void deleteAllEntities();

    public void deleteCardTenWorker(Integer cardTenWorkerId);
}
