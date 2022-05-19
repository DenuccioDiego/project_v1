package com.projectv1.project_v1.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private String password;
    private Integer company_id;
    private Integer id;

    /*
     * public UserDto(String name, String surname, String password, Integer
     * company_id, Integer id) {
     * this.name = name;
     * this.surname = surname;
     * this.password = password;
     * this.company_id = company_id;
     * this.id = id;
     * }
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
