package com.ezycom.projectEzycom.entities;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produit{
    public Produit(){
    }

    public Produit(String produitName, String family, Long prix){
        this.produitName = produitName;
        this.family = family;
        this.prix = prix;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String produitName;
    private String family;
    private Long prix;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduitName() {
        return produitName;
    }

    public void setProduitName(String produitName) {
        this.produitName = produitName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Long getPrix() {
        return prix;
    }

    public void setPrix(Long prix) {
        this.prix = prix;
    }
}