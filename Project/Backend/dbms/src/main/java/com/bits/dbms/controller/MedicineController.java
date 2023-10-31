package com.bits.dbms.controller;

import com.bits.dbms.service.MedicineService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/medicine")
@Api(tags = "API for Medicine")
@CrossOrigin
public class MedicineController {

    @Autowired
    private Environment environment;

    @Autowired
    private MedicineService medicineService;
}
