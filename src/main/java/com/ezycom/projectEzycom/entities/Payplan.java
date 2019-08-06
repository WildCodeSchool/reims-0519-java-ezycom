package com.ezycom.projectEzycom.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payplan{
    public Payplan(){
    }

    public Payplan(String name, String objectiveDeadline, String typeRemuneration,
    int objectif, int payRate, int remunerationSub, int integrationBonus,
    int integrationBonusTime){
        this.name = name; //Nom
        this.objectiveDeadline = objectiveDeadline; // Echéance Objectif
        this.typeRemuneration = typeRemuneration; //Remuneration sur CA ou Marge
        this.objectif = objectif; //Objectif
        this.payRate = payRate; //taux de rémuneration
        this.remunerationSub = remunerationSub; //Remuneration Location/Abonnement
        this.integrationBonus = integrationBonus; //Montant de la prime d'intégration
        this.integrationBonusTime = integrationBonusTime; //durée de la prime d'integration
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String objectiveDeadline;
    private String typeRemuneration;
    private int objectif;
    private int payRate;
    private int remunerationSub;
    private int integrationBonus;
    private int integrationBonusTime;

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
    public String getname() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setname(String name) {
        this.name = name;
    }

    /**
     * @return String return the objectiveDeadline
     */
    public String getobjectiveDeadline() {
        return objectiveDeadline;
    }

    /**
     * @param objectiveDeadline the objectiveDeadline to set
     */
    public void setobjectiveDeadline(String objectiveDeadline) {
        this.objectiveDeadline = objectiveDeadline;
    }

    /**
     * @return String return the typeRemuneration
     */
    public String gettypeRemuneration() {
        return typeRemuneration;
    }

    /**
     * @param typeRemuneration the typeRemuneration to set
     */
    public void settypeRemuneration(String typeRemuneration) {
        this.typeRemuneration = typeRemuneration;
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
     * @return int return the payRate
     */
    public int getpayRate() {
        return payRate;
    }

    /**
     * @param payRate the payRate to set
     */
    public void setpayRate(int payRate) {
        this.payRate = payRate;
    }

    /**
     * @return int return the remunerationSub
     */
    public int getremunerationSub() {
        return remunerationSub;
    }

    /**
     * @param remunerationSub the remunerationSub to set
     */
    public void setremunerationSub(int remunerationSub) {
        this.remunerationSub = remunerationSub;
    }

    /**
     * @return int return the integrationBonus
     */
    public int getintegrationBonus() {
        return integrationBonus;
    }

    /**
     * @param integrationBonus the integrationBonus to set
     */
    public void setintegrationBonus(int integrationBonus) {
        this.integrationBonus = integrationBonus;
    }

    /**
     * @return int return the integrationBonusTime
     */
    public int getintegrationBonusTime() {
        return integrationBonusTime;
    }

    /**
     * @param integrationBonusTime the integrationBonusTime to set
     */
    public void setintegrationBonusTime(int integrationBonusTime) {
        this.integrationBonusTime = integrationBonusTime;
    }

}