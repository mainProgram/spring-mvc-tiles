package com.groupeisi.companyspringmvctiles.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "commandes")
public class CommandeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public CommandeEntity() {
    }

    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

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

    @ManyToOne
    @JoinColumn(name = "panier_id")
    private PanierEntity panier;
}
