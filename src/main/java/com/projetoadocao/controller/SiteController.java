package com.projetoadocao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping("")
    public String adicionarteste(){
        return "CadastroAnimais";
    }
    
}
