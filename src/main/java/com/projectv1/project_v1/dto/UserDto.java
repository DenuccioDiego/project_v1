package com.projectv1.project_v1.dto;

import java.io.Serializable;

import com.projectv1.project_v1.model.entities.Company;

public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private String password;
    private Company company;
    private Long companyId;
    private Long id;

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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
