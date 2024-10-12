package com.groupeisi.companyspringmvctiles.controller;

import com.groupeisi.companyspringmvctiles.dto.ProductDto;
import com.groupeisi.companyspringmvctiles.dto.PanierDto;
import com.groupeisi.companyspringmvctiles.service.IPanierService;
import com.groupeisi.companyspringmvctiles.service.PanierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class PanierController {

    private static final Logger logger = LoggerFactory.getLogger(PanierController.class);

    private IPanierService panierService;

    public PanierController(){
        this.panierService = new PanierService();
    }

    @GetMapping("/paniers")
    public String showAll(Model model) {
        logger.info(" - Méthode GET appelée pour afficher les paniers");

        try {
            Optional<List<PanierDto>> paniers = panierService.findAll();
            model.addAttribute("paniersList", paniers.orElse(new ArrayList<>()));

        } catch (Exception e) {
            logger.error("Erreur lors de la récupération des données", e);
        }

        return "paniers";
    }
}
