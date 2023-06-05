package com.loopplay.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loopplay.system.model.Usuario;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {
    
    @GetMapping("/")
    public String mensagem(){
        return "Hello Worlds!";
    }

    @GetMapping("/home/{nome}")
    public String home(@PathVariable String nome) {
        return "Bem vindo ao nosso sistema, " + nome;
    }
    
    @PostMapping("/user")
    public Usuario usuario(@RequestBody Usuario user){
        return user;

    }
}
