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
    private Long emaillist;
    private Long payplanlist;
    private Date start;
    private Date finish;

    @ManyToOne
    private User user;
 
    @ManyToOne
    private Payplan payplan;

    public PayplanUser(Long emaillist, Long payplanlist, Date start, Date finish) {
        this.emaillist = emaillist;
        this.payplanlist = payplanlist;
        this.start = start;
        this.finish = finish;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmaillist() {
        return emaillist;
    }

    public void setEmaillist(Long emaillist) {
        this.emaillist = emaillist;
    }

    public Long getPayplanlist() {
        return payplanlist;
    }

    public void setPayplanlist(Long payplanlist) {
        this.payplanlist = payplanlist;
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

}