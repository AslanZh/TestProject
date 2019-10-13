package com.company.firstproject.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Currency implements EnumClass<String> {

    USD("A"),
    TENGE("B"),
    RUB("C"),
    YUAN("D");

    private String id;

    Currency(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Currency fromId(String id) {
        for (Currency at : Currency.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}