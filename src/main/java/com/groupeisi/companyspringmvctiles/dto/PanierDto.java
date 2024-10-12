package com.groupeisi.companyspringmvctiles.dto;

import com.groupeisi.companyspringmvctiles.entities.ClientEntity;
import com.groupeisi.companyspringmvctiles.entities.CommandeEntity;
import com.groupeisi.companyspringmvctiles.entities.ProductEntity;

import java.util.Date;
import java.util.List;

public class PanierDto {

    private Long id;

    private Date date;

    private ClientEntity client;

    private List<ProductEntity> products;

    private List<CommandeEntity> commandes;

    public PanierDto() {
    }

    public PanierDto(Long id, Date date, ClientEntity client, List<ProductEntity> products, List<CommandeEntity> commandes) {
        this.id = id;
        this.date = date;
        this.client = client;
        this.products = products;
        this.commandes = commandes;
    }
}
