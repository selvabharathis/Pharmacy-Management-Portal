package com.bits.dbms.service.impl;

import com.bits.dbms.repository.InventoryRepository;
import com.bits.dbms.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value="inventoryService")
@Transactional
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;
}
