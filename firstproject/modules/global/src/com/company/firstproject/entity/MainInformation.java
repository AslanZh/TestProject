package com.company.firstproject.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "FIRSTPROJECT_MAIN_INFORMATION")
@Entity(name = "firstproject_MainInformation")
public class MainInformation extends StandardEntity {
    private static final long serialVersionUID = -6842938774322024721L;

    @NotNull
    @Column(name = "BIN", nullable = false)
    protected String bin;

    @NotNull
    @Column(name = "RESIDENT", nullable = false)
    protected Boolean resident = false;

    public Boolean getResident() {
        return resident;
    }

    public void setResident(Boolean resident) {
        this.resident = resident;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }
}