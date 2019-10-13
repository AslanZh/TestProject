package com.company.firstproject.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Country implements EnumClass<String> {

    USA("A"),
    RUSSIA("B"),
    KAZAKHSTAN("C"),
    CHINA("D"),
    JAPAN("E");


    private String id;

    Country(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Country fromId(String id) {
        for (Country at : Country.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}