package com.company.firstproject.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "FIRSTPROJECT_ADRESSES")
@Entity(name = "firstproject_Adresses")
public class Adresses extends StandardEntity {
    private static final long serialVersionUID = -3534861469751802632L;

    @NotNull
    @Column(name = "COUNTRY", nullable = false)
    protected String country;

    @Column(name = "Region")
    protected String region;

    @Column(name = "Area")
    protected String area;

    @NotNull
    @Column(name = "City", nullable = false)
    protected String city;

    @NotNull
    @Column(name = "Street", nullable = false)
    protected String street;

    @NotNull
    @Column(name = "House", nullable = false)
    protected String house;

    @Column(name = "Building")
    protected String building;

    @Column(name = "Flat")
    protected String flat;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup"})
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRAGENT_ID")
    protected Contragents contragent;

    public void setCountry(Country country) {
        this.country = country == null ? null : country.getId();
    }

    public Country getCountry() {
        return country == null ? null : Country.fromId(country);
    }

    public Contragents getContragent() {
        return contragent;
    }

    public void setContragent(Contragents contragent) {
        this.contragent = contragent;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}