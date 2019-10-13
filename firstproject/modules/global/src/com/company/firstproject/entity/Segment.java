package com.company.firstproject.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Segment implements EnumClass<String> {

    STANDART("A");

    private String id;

    Segment(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Segment fromId(String id) {
        for (Segment at : Segment.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}