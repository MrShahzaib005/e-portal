package com.university.portal.service;

import com.university.portal.model.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryService {
    public List<Inventory> getAllInventory();

    public Optional<Inventory> getInventory(Integer inventoryid);
}
