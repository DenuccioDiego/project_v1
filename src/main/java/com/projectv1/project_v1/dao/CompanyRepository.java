package com.projectv1.project_v1.dao;

import com.projectv1.project_v1.model.entities.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query("select company from Company company where company.name = :name and company.description = :description")
    Company findByNameAndDescription(@Param("name") String name, @Param("description") String description);

}
