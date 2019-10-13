package com.company.firstproject.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "FIRSTPROJECT_TEAM")
@Entity(name = "firstproject_Team")
public class Team extends StandardEntity {
    private static final long serialVersionUID = 1888774383246747012L;

    @NotNull
    @Column(name = "FULLNAME", nullable = false)
    protected String fullname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTAGENTS_ID")
    protected Contragents contagents;

    @Column(name = "ROLE")
    protected String role;

    public Contragents getContagents() {
        return contagents;
    }

    public void setContagents(Contragents contagents) {
        this.contagents = contagents;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}