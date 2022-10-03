package com.choinhet.televisionproductionline.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Television {
    @Id
    @GeneratedValue
    private Long id;
    private String modelName;

    public Television() {

    }

    public Television(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getId() {
        return id;
    }
}
