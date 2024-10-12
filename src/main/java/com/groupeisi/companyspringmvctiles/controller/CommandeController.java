package com.groupeisi.companyspringmvctiles.controller;

import com.groupeisi.companyspringmvctiles.service.CommandeService;
import com.groupeisi.companyspringmvctiles.service.ICommandeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/commandes")
public class CommandeController {

    private static final Logger logger = LoggerFactory.getLogger(CommandeController.class);

    private ICommandeService commandeService;

    public CommandeController(){
        this.commandeService = new CommandeService();
    }

    @GetMapping("")
    public String showAll(Model model) {
        logger.info(" - Méthode GET appelée pour afficher les commandes");

        return "commandes";
    }
}
