package com.company.firstproject.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Industry implements EnumClass<String> {

    MANUFACTURING("A"),
    FINANCE("B");

    private String id;

    Industry(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Industry fromId(String id) {
        for (Industry at : Industry.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}