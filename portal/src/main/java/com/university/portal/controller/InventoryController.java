package com.university.portal.controller;

import com.university.portal.model.Inventory;
import com.university.portal.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping("/inventory")
    public List<Inventory> index(){ return inventoryService.getAllInventory();}
}
