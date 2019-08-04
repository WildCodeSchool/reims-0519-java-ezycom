package com.ezycom.projectEzycom.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payplan{
    public Payplan(){
    }

    public Payplan(String nom, String echeance_objectif, String remun_sur,
    int objectif, int taux_remun, int remun_loc_abo, int prime_integration,
    int prime_integration_mois){
        this.nom = nom;
        this.echeance_objectif = echeance_objectif;
        this.remun_sur = remun_sur;
        this.objectif = objectif;
        this.taux_remun = taux_remun;
        this.remun_loc_abo = remun_loc_abo;
        this.prime_integration = prime_integration;
        this.prime_integration_mois = prime_integration_mois;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String echeance_objectif;
    private String remun_sur;
    private int objectif;
    private int taux_remun;
    private int remun_loc_abo;
    private int prime_integration;
    private int prime_integration_mois;

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
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return String return the echeance_objectif
     */
    public String getEcheance_objectif() {
        return echeance_objectif;
    }

    /**
     * @param echeance_objectif the echeance_objectif to set
     */
    public void setEcheance_objectif(String echeance_objectif) {
        this.echeance_objectif = echeance_objectif;
    }

    /**
     * @return String return the remun_sur
     */
    public String getRemun_sur() {
        return remun_sur;
    }

    /**
     * @param remun_sur the remun_sur to set
     */
    public void setRemun_sur(String remun_sur) {
        this.remun_sur = remun_sur;
    }

    /**
     * @return int return the objectif
     */
    public int getObjectif() {
        return objectif;
    }

    /**
     * @param objectif the objectif to set
     */
    public void setObjectif(int objectif) {
        this.objectif = objectif;
    }

    /**
     * @return int return the taux_remun
     */
    public int getTaux_remun() {
        return taux_remun;
    }

    /**
     * @param taux_remun the taux_remun to set
     */
    public void setTaux_remun(int taux_remun) {
        this.taux_remun = taux_remun;
    }

    /**
     * @return int return the remun_loc_abo
     */
    public int getRemun_loc_abo() {
        return remun_loc_abo;
    }

    /**
     * @param remun_loc_abo the remun_loc_abo to set
     */
    public void setRemun_loc_abo(int remun_loc_abo) {
        this.remun_loc_abo = remun_loc_abo;
    }

    /**
     * @return int return the prime_integration
     */
    public int getPrime_integration() {
        return prime_integration;
    }

    /**
     * @param prime_integration the prime_integration to set
     */
    public void setPrime_integration(int prime_integration) {
        this.prime_integration = prime_integration;
    }

    /**
     * @return int return the prime_integration_mois
     */
    public int getPrime_integration_mois() {
        return prime_integration_mois;
    }

    /**
     * @param prime_integration_mois the prime_integration_mois to set
     */
    public void setPrime_integration_mois(int prime_integration_mois) {
        this.prime_integration_mois = prime_integration_mois;
    }

}