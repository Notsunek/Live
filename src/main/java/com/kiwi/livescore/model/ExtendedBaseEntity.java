package com.kiwi.livescore.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class ExtendedBaseEntity extends BaseEntity {

    private int sort;

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
