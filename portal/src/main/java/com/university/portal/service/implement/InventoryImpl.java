package com.university.portal.service.implement;

import com.university.portal.model.Inventory;
import com.university.portal.repository.InventoryRepository;
import com.university.portal.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryImpl implements InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    @Override
    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    @Override
    public Optional<Inventory> getInventory(Integer inventoryid) {
        return inventoryRepository.findById(inventoryid);
    }
}
