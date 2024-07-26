package com.university.portal.service.implement;

import com.university.portal.model.CardTenWorker;
import com.university.portal.service.CardTenWorkerService;
import com.university.portal.repository.CardTenWorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardTenWorkerImpl implements CardTenWorkerService {

    @Autowired
    CardTenWorkerRepository cardTenWorkerRepository;

    @Override
    public CardTenWorker save(CardTenWorker cardTenWorker) {
        return cardTenWorkerRepository.save(cardTenWorker);
    }
}
