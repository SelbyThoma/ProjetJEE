package com.projetjee.gestionhotel.controller;

import com.projetjee.gestionhotel.service.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChambreController {
    @Autowired
    private ChambreService chambreService;
    @GetMapping("/chambre")
    public String viewHomePage(Model model)
    {
        model.addAttribute("listChambre",chambreService.getAllChambre());
        return "index";
    }
}
