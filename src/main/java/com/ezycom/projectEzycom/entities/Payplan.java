package com.ezycom.projectEzycom.entities;

import javax.persistence.Column;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotBlank;

import javax.persistence.OneToMany;


@Entity
public class Payplan {
    public Payplan() {
    }


    public Payplan(String name, String objectiveDeadline, String typeRemuneration,
    Integer objectif, Integer payRate, Integer remunerationSub, Integer integrationBonus,
    Integer integrationBonusTime, Boolean integration, Integer remunerationLocation){
        this.name = name; //Nom
        this.objectiveDeadline = objectiveDeadline; // Echéance Objectif
        this.payRate = payRate; //Taux de rémuneration !!! Ne fonctionne plus
        this.typeRemuneration = typeRemuneration; //Rémunération sur CA ou Marge
        this.objectif = objectif; //Objectifs
        this.remunerationLocation = remunerationLocation; // Rémunération sur contrat location/Abonnement   !!! Ne fonctionne plus
        this.integration = integration; //bouton Prime d'intégration
        this.integrationBonus = integrationBonus; //Montant de la prime d'intégration   !!! Ne fonctionne plus
        this.integrationBonusTime = integrationBonusTime; //durée de la prime d'integration
        this.remunerationSub = remunerationSub; //Palier payplan   !!! Ne fonctionne plus

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotBlank
    private String name;
    private String objectiveDeadline;
    private String typeRemuneration;
    private Integer objectif;
    private Integer payRate;
    private Integer remunerationSub;
    private Integer integrationBonus;
    private Integer integrationBonusTime;
    private Boolean integration;
    private Integer remunerationLocation;

    @OneToMany(mappedBy = "payplan")
    private Set<PayplanUser> payplanUsers;

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
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the objectiveDeadline
     */
    public String getObjectiveDeadline() {
        return objectiveDeadline;
    }

    /**
     * @param objectiveDeadline the objectiveDeadline to set
     */
    public void setObjectiveDeadline(String objectiveDeadline) {
        this.objectiveDeadline = objectiveDeadline;
    }

    /**
     * @return String return the typeRemuneration
     */
    public String getTypeRemuneration() {
        return typeRemuneration;
    }

    /**
     * @param typeRemuneration the typeRemuneration to set
     */
    public void setTypeRemuneration(String typeRemuneration) {
        this.typeRemuneration = typeRemuneration;
    }

    /**
     * @return int return the objectif
     */
    public Integer getObjectif() {
        return objectif;
    }

    /**
     * @param objectif the objectif to set
     */
    public void setObjectif(Integer objectif) {
        this.objectif = objectif;
    }

    /**
     * @return int return the payRate
     */
    public Integer getPayRate() {
        return payRate;
    }

    /**
     * @param payRate the payRate to set
     */
    public void setPayRate(Integer payRate) {
        this.payRate = payRate;
    }

    /**
     * @return int return the remunerationSub
     */
    public Integer getRemunerationSub() {
        return remunerationSub;
    }

    /**
     * @param remunerationSub the remunerationSub to set
     */
    public void setRemunerationSub(Integer remunerationSub) {
        this.remunerationSub = remunerationSub;
    }

    /**
     * @return int return the integrationBonus
     */
    public Integer getIntegrationBonus() {
        return integrationBonus;
    }

    /**
     * @param integrationBonus the integrationBonus to set
     */
    public void setIntegrationBonus(Integer integrationBonus) {
        this.integrationBonus = integrationBonus;
    }

    /**
     * @return int return the integrationBonusTime
     */
    public Integer getIntegrationBonusTime() {
        return integrationBonusTime;
    }

    /**
     * @param integrationBonusTime the integrationBonusTime to set
     */
    public void setIntegrationBonusTime(Integer integrationBonusTime) {
        this.integrationBonusTime = integrationBonusTime;
    }

    public Boolean getIntegration() {
        return integration;
    }

    public void setIntegration(Boolean integration) {
        this.integration = integration;
    }

    public Integer getRemunerationLocation() {
        return remunerationLocation;
    }

    public void setRemunerationLocation(Integer remunerationLocation) {
        this.remunerationLocation = remunerationLocation;
    }

}