package com.ezycom.projectEzycom.entities;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sale {
    public Sale(){
    }

    public Sale(Long purchase, String purchaseDate, String commercial, 
    String productCode, int quantity, int preTaxeRealPrice, int preTaxeSalePrice, int marge, int percent, String month){
        
        this.purchase = purchase;// numéro de commande
        this.purchaseDate = purchaseDate;// date de la commande
        this.month = month;
        this.commercial = commercial;//nom du commercial
        this.productCode = productCode;//code du Product
        this.quantity = quantity;//quantity de produits
        this.preTaxeRealPrice = preTaxeRealPrice;//prix réel hors taxe
        this.preTaxeSalePrice = preTaxeSalePrice;//prix de vente hors taxe
        this.marge = marge;//marge du Product
        this.percent = percent;
        this.month = month;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private int id;
    private Long purchase;   
    private String purchaseDate;  
    private String commercial;    
    private String productCode;   
    private int quantity;    
    private int preTaxeRealPrice;    
    private int preTaxeSalePrice;    
    private int marge;
    private int percent;
    private String month;
    

    public Long getPurchase() {
        return purchase;
    }

    public void setPurchase(Long purchase) {
        this.purchase = purchase;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getCommercial() {
        return commercial;
    }

    public void setCommercial(String commercial) {
        this.commercial = commercial;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPreTaxeRealPrice() {
        return preTaxeRealPrice;
    }

    public void setPreTaxeRealPrice(int preTaxeRealPrice) {
        this.preTaxeRealPrice = preTaxeRealPrice;
    }

    public int getPreTaxeSalePrice() {
        return preTaxeSalePrice;
    }

    public void setPreTaxeSalePrice(int preTaxeSalePrice) {
        this.preTaxeSalePrice = preTaxeSalePrice;
    }

    public int getMarge() {
        return marge;
    }

    public void setMarge(int marge) {
        this.marge = marge;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

}