package org.addin.learns.learn01.domain;

import javax.persistence.Entity;

@Entity
public class Sku extends AbstractPersistable {
    private String name;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Sku name(String name) {
        this.name = name;
        return this;
    }

    public Sku description(String description) {
        this.description = description;
        return this;
    }
}
