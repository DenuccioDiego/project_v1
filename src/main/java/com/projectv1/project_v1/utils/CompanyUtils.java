package com.projectv1.project_v1.utils;

import com.projectv1.project_v1.dto.CompanyDto;
import com.projectv1.project_v1.model.entities.Company;

public class CompanyUtils {

    public static CompanyDto fromDVOtoDTO(Company companyDvo) {

        CompanyDto dto = new CompanyDto();

        dto.setId(companyDvo.getId());
        dto.setName(companyDvo.getName());
        dto.setDescription(companyDvo.getDescription());

        return dto;
    }

}
