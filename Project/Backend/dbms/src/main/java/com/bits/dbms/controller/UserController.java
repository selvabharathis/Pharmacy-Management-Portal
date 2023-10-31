package com.bits.dbms.controller;

import com.bits.dbms.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
@Api(tags = "API for User")
@CrossOrigin
public class UserController {

    @Autowired
    private Environment environment;

    @Autowired
    private UserService userService;
}
