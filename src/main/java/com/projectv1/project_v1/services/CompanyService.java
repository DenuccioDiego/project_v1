package com.projectv1.project_v1.services;

import java.util.List;

import com.projectv1.project_v1.dto.CompanyDto;

public interface CompanyService {
    List<CompanyDto> getAllCompanyDto();

    CompanyDto getCompanyDtoById(Long id);
}
