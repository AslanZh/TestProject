package com.company.firstproject.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "FIRSTPROJECT_COMPANY")
@Entity(name = "firstproject_Company")
public class Company extends StandardEntity {
    private static final long serialVersionUID = 4853850047508312619L;

    @NotNull
    @Column(name = "INDUSTRY", nullable = false)
    protected String industry;

    @NotNull
    @Column(name = "INCOME", nullable = false)
    protected BigDecimal income;

    @Temporal(TemporalType.DATE)
    @Column(name = "COMPANY_DATE")
    protected Date companyDate;

    @Column(name = "WEB")
    protected String web;

    @Column(name = "PARTICIPANTS")
    protected String participants;

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Date getCompanyDate() {
        return companyDate;
    }

    public void setCompanyDate(Date companyDate) {
        this.companyDate = companyDate;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}