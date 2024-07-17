package com.university.portal.service.implement;

import com.university.portal.repository.InventoryRepository;
import com.university.portal.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryImpl implements InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;
}
