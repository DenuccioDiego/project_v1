package com.projectv1.project_v1.controllers;

import java.util.List;

import com.projectv1.project_v1.dto.CompanyDto;
import com.projectv1.project_v1.services.CompanyService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyRestController {

    private final CompanyService companyService;

    public CompanyRestController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<CompanyDto> getAllCompany() {
        return companyService.getAllCompanyDto();
    }

    @GetMapping("/{companyId}")
    public CompanyDto getCompanyById(@PathVariable("companyId") Long id) {
        return companyService.getCompanyDtoById(id);
    }

}
