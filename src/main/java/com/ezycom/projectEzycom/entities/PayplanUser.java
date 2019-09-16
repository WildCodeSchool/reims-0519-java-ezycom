package com.ezycom.projectEzycom.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class PayplanUser {

    public PayplanUser(Date startDate, Date endDate, Long user_id, Long payplan_id) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.user_id = user_id;
        this.payplan_id = payplan_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    private Long user_id;
    private Long payplan_id;
 
    @ManyToOne
    private User user;
 
    @ManyToOne
    private Payplan payplan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    /**
     * @return Long return the user_id
     */
    public Long getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    /**
     * @return Long return the payplan_id
     */
    public Long getPayplan_id() {
        return payplan_id;
    }

    /**
     * @param payplan_id the payplan_id to set
     */
    public void setPayplan_id(Long payplan_id) {
        this.payplan_id = payplan_id;
    }

    /**
     * @return User return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return Payplan return the payplan
     */
    public Payplan getPayplan() {
        return payplan;
    }

    /**
     * @param payplan the payplan to set
     */
    public void setPayplan(Payplan payplan) {
        this.payplan = payplan;
    }

}