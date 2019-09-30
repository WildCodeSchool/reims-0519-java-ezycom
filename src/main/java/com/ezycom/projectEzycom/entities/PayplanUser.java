package com.ezycom.projectEzycom.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class PayplanUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date start;
    private Date finish;

    @ManyToOne
    private User user;
 
    @ManyToOne
    private Payplan payplan;


    public PayplanUser(User user, Payplan payplan, Date start, Date finish) {
        this.user = user;
        this.payplan = payplan;
        this.start = start;
        this.finish = finish;
    }

    public PayplanUser(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payplan getPayplan() {
        return payplan;
    }

    public void setPayplan(Payplan payplan) {
        this.payplan = payplan;
    }



    public PayplanUser(Long id, Date start, Date finish, User user, Payplan payplan) {
        this.id = id;
        this.start = start;
        this.finish = finish;
        this.user = user;
        this.payplan = payplan;
    }

}