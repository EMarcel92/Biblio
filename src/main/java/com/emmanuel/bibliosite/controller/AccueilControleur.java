package com.emmanuel.bibliosite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilControleur {
    @GetMapping("/")
    public String accueil(Model model){
        return "Accueil";
    }
}
