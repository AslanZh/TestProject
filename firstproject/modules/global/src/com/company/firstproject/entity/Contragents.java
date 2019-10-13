package com.company.firstproject.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "FIRSTPROJECT_CONTRAGENTS")
@Entity(name = "firstproject_Contragents")
public class Contragents extends StandardEntity {
    private static final long serialVersionUID = 1203992422768181860L;

    @NotNull
    @Column(name = "Наименование", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "ACTIVE", nullable = false)
    protected Boolean active = false;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGE_ID")
    protected FileDescriptor image;

    @Column(name = "Роли")
    protected String rules;

    @NotNull
    @Column(name = "Тип", nullable = false)
    protected String type;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "contragent")
    protected Adresses adresses;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTACT_INFO_ID")
    protected ContactInfo contactInfo;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "contragents")
    protected Roles roles;

    public FileDescriptor getImage() {
        return image;
    }

    public void setImage(FileDescriptor image) {
        this.image = image;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Adresses getAdresses() {
        return adresses;
    }

    public void setAdresses(Adresses adresses) {
        this.adresses = adresses;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getActive() {
        return active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}