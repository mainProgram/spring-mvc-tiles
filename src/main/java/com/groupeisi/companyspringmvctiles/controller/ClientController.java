package com.groupeisi.companyspringmvctiles.controller;

import com.groupeisi.companyspringmvctiles.service.ClientService;
import com.groupeisi.companyspringmvctiles.service.IClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    private static final Logger logger = LoggerFactory.getLogger(ClientController.class);

    private IClientService clientService;

    public ClientController(){
        this.clientService = new ClientService();
    }

    @GetMapping("/clients")
    public String showAll(Model model) {
        logger.info("ClientController - Méthode GET appelée pour afficher les clients");

        return "clients";
    }
}
