package com.university.portal.service.implement;

import com.university.portal.model.CardTenantWorker;
import com.university.portal.repository.CardTenantWorkerRepository;
import com.university.portal.service.CardTenantWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class CardTenantWorkerImpl implements CardTenantWorkerService {

    @Autowired
    CardTenantWorkerRepository cardTenantWorkerRepository;
    @Override
    public List<CardTenantWorker> getAllCardTenantWorker() {
        return cardTenantWorkerRepository.findAll();
    }
}
