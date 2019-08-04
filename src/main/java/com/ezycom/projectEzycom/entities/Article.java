package com.ezycom.projectEzycom.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article{
    public Article(){
    }

    public Article(String nom_article, String famille){
        this.nom_article = nom_article;
        this.famille = famille;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_article;
    private String famille;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nom_article
     */
    public String getNom_article() {
        return nom_article;
    }

    /**
     * @param nom_article the nom_article to set
     */
    public void setNom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    /**
     * @return String return the famille
     */
    public String getFamille() {
        return famille;
    }

    /**
     * @param famille the famille to set
     */
    public void setFamille(String famille) {
        this.famille = famille;
    }

}