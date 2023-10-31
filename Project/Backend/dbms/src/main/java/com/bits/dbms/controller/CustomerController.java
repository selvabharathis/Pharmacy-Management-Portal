package com.bits.dbms.controller;

import com.bits.dbms.service.CustomerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/customer")
@Api(tags = "API for Customers")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private Environment environment;

    @GetMapping(value="/test")
    public String testApi() throws Exception {
        return "Welcome to my pharmacy project";
    }
}
