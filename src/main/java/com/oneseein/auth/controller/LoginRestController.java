package com.oneseein.auth.controller;

import com.oneseein.auth.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/login")
public class LoginRestController {

    @Autowired
    private LoginService service;


}
