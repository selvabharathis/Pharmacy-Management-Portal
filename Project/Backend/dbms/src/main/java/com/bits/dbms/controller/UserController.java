package com.bits.dbms.controller;

import com.bits.dbms.dto.UserDTO;
import com.bits.dbms.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/user")
@Api(tags = "API for User")
@CrossOrigin
public class UserController {

    @Autowired
    private Environment environment;

    @Autowired
    private UserService userService;

    @PostMapping(value = "/signUp",produces = "application/json")
    public Long signUpUser(@RequestBody UserDTO user) throws Exception{
        return this.userService.signUp(user);
    }

    @PostMapping(value = "/signIn",produces = "application/json")
    public UserDTO signInUser(@RequestBody UserDTO user) throws Exception{
        return this.userService.signIn(user);
    }
}
