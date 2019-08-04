package com.ezycom.projectEzycom.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Remuneration{
    public Remuneration(){
    }

    public Remuneration(int Payplan_id, int Commercial_id){
        this.Payplan_id = Payplan_id;
        this.Commercial_id = Commercial_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int Payplan_id;
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
     * @return int return the Payplan_id
     */
    public int getPayplan_id() {
        return Payplan_id;
    }

    /**
     * @param Payplan_id the Payplan_id to set
     */
    public void setPayplan_id(int Payplan_id) {
        this.Payplan_id = Payplan_id;
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