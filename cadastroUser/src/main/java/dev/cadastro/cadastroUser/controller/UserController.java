package dev.cadastro.cadastroUser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/login")
    String login(){
        return "Login" ;
    }


}
