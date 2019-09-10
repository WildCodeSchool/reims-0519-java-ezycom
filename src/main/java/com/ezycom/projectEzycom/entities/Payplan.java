package com.ezycom.projectEzycom.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.ezycom.projectEzycom.repositories.UserPayplanRepository;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Payplan {
    public Payplan() {
    }

    public Payplan(String name, String objectiveDeadline, String typeRemuneration, int objectif, int payRate,
            int remunerationSub, int integrationBonus, int integrationBonusTime, boolean integration,
            int remunerationLocation) {
        this.name = name; // Nom
        this.objectiveDeadline = objectiveDeadline; // Echéance Objectif
        this.typeRemuneration = typeRemuneration; // Remuneration sur CA ou Marge
        this.objectif = objectif; // Objectif
        this.payRate = payRate; // taux de rémuneration
        this.remunerationSub = remunerationSub; // Remuneration Location/Abonnement
        this.integrationBonus = integrationBonus; // Montant de la prime d'intégration
        this.integrationBonusTime = integrationBonusTime; // durée de la prime d'integration
        this.integration = integration; // bouton Prim d'integration
        this.remunerationLocation = remunerationLocation; // Remuneration sur contrat location/Abonnement
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
    private boolean integration;
    private int remunerationLocation;

    @OneToMany(mappedBy = "payplan")
    Set<UserPayplanRepository> registrations;

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
    public int getPayRate() {
        return payRate;
    }

    /**
     * @param payRate the payRate to set
     */
    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    /**
     * @return int return the remunerationSub
     */
    public int getRemunerationSub() {
        return remunerationSub;
    }

    /**
     * @param remunerationSub the remunerationSub to set
     */
    public void setRemunerationSub(int remunerationSub) {
        this.remunerationSub = remunerationSub;
    }

    /**
     * @return int return the integrationBonus
     */
    public int getIntegrationBonus() {
        return integrationBonus;
    }

    /**
     * @param integrationBonus the integrationBonus to set
     */
    public void setIntegrationBonus(int integrationBonus) {
        this.integrationBonus = integrationBonus;
    }

    /**
     * @return int return the integrationBonusTime
     */
    public int getIntegrationBonusTime() {
        return integrationBonusTime;
    }

    /**
     * @param integrationBonusTime the integrationBonusTime to set
     */
    public void setIntegrationBonusTime(int integrationBonusTime) {
        this.integrationBonusTime = integrationBonusTime;
    }

    public boolean isIntegration() {
        return integration;
    }

    public void setIntegration(boolean integration) {
        this.integration = integration;
    }

    public int getRemunerationLocation() {
        return remunerationLocation;
    }

    public void setRemunerationLocation(int remunerationLocation) {
        this.remunerationLocation = remunerationLocation;
    }

}