package com.ezycom.projectEzycom.entities;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product{
    public Product(){
    }

    public Product(String productCode, String familly, String products, String subscription, String subProducts){

        this.productCode = productCode;//code du Product
        this.familly = familly; //famille de produit
        this.products = products; //type de produit
        this.subscription = subscription; //vente abonnement
        this.subProducts = subProducts; //sous-produit
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Long id;
        private String productCode;
        private String familly;
        private String products;
        private String subscription;
        private String subProducts;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getFamilly() {
        return familly;
    }

    public void setFamilly(String familly) {
        this.familly = familly;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public String getSubProducts() {
        return subProducts;
    }

    public void setSubProducts(String subProducts) {
        this.subProducts = subProducts;
    }

}