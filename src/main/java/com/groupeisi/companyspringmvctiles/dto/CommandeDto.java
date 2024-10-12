package com.groupeisi.companyspringmvctiles.dto;

import com.groupeisi.companyspringmvctiles.entities.PanierEntity;

import java.util.Date;

public class CommandeDto {

    private Long id;

    private Date date;

    private PanierEntity panier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PanierEntity getPanier() {
        return panier;
    }

    public void setPanier(PanierEntity panier) {
        this.panier = panier;
    }

    public CommandeDto() {
    }

    public CommandeDto(Long id, Date date, PanierEntity panier) {
        this.id = id;
        this.date = date;
        this.panier = panier;
    }
}
