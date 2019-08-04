package com.ezycom.projectEzycom.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendre{
    public Vendre(){
    }

    public Vendre(int Article_id, int Commercial_id){
        this.Article_id = Article_id;
        this.Commercial_id = Commercial_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int Article_id;
    private int Commercial_id;

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
     * @return int return the Article_id
     */
    public int getArticle_id() {
        return Article_id;
    }

    /**
     * @param Article_id the Article_id to set
     */
    public void setArticle_id(int Article_id) {
        this.Article_id = Article_id;
    }

    /**
     * @return int return the Commercial_id
     */
    public int getCommercial_id() {
        return Commercial_id;
    }

    /**
     * @param Commercial_id the Commercial_id to set
     */
    public void setCommercial_id(int Commercial_id) {
        this.Commercial_id = Commercial_id;
    }

}