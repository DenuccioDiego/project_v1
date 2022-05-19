package com.projectv1.project_v1.dto;

import java.io.Serializable;

public class CompanyDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String description;
    private String name;
    private Long id;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
