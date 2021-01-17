package com.kiwi.livescore.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity extends IdEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
