package com.bits.dbms.controller;

import com.bits.dbms.service.InventoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/inventory")
@Api(tags = "API for Inventory")
@CrossOrigin
public class InventoryController {

    @Autowired
    private Environment environment;

    @Autowired
    private InventoryService inventoryService;
}
