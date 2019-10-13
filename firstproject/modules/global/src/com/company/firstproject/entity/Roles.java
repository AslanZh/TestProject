package com.company.firstproject.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamePattern("%s|name")
@Table(name = "FIRSTPROJECT_ROLES")
@Entity(name = "firstproject_Roles")
public class Roles extends StandardEntity {
    private static final long serialVersionUID = -3080839946783679445L;

    @Column(name = "NAME")
    protected String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRAGENTS_ID")
    protected Contragents contragents;

    @NotNull
    @Column(name = "MAIN", nullable = false)
    protected Boolean main = false;

    @Temporal(TemporalType.DATE)
    @Column(name = " Validity")
    protected Date validityfrom;

    @Temporal(TemporalType.DATE)
    @Column(name = "Validuntil")
    protected Date validuntil;

    public Contragents getContragents() {
        return contragents;
    }

    public void setContragents(Contragents contragents) {
        this.contragents = contragents;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    public Boolean getMain() {
        return main;
    }

    public Date getValiduntil() {
        return validuntil;
    }

    public void setValiduntil(Date validuntil) {
        this.validuntil = validuntil;
    }

    public Date getValidityfrom() {
        return validityfrom;
    }

    public void setValidityfrom(Date validityfrom) {
        this.validityfrom = validityfrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}