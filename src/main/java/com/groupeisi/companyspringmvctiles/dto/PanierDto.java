package com.groupeisi.companyspringmvctiles.dto;


import java.util.Date;
import java.util.List;

public class PanierDto {

    private Long id;

    private Date date;

    private ClientDto client;

    private List<ProductDto> products;

    private List<CommandeDto> commandes;

    public PanierDto() {
    }

    public PanierDto(Long id, Date date, ClientDto client, List<ProductDto> products, List<CommandeDto> commandes) {
        this.id = id;
        this.date = date;
        this.client = client;
        this.products = products;
        this.commandes = commandes;
    }

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

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }

    public List<CommandeDto> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<CommandeDto> commandes) {
        this.commandes = commandes;
    }
}
