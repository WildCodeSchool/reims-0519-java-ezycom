package com.ezycom.projectEzycom.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article{
    public Article(){
    }

    public Article(String articleName, String family){
        this.articleName = articleName;
        this.family = family;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String articleName;
    private String family;

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
     * @return String return the articleName
     */
    public String getarticleName() {
        return articleName;
    }

    /**
     * @param articleName the articleName to set
     */
    public void setarticleName(String articleName) {
        this.articleName = articleName;
    }

    /**
     * @return String return the family
     */
    public String getfamily() {
        return family;
    }

    /**
     * @param family the family to set
     */
    public void setfamily(String family) {
        this.family = family;
    }

}