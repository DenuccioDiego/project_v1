package com.projectv1.project_v1.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.projectv1.project_v1.dao.CompanyRepository;
import com.projectv1.project_v1.dto.CompanyDto;
import com.projectv1.project_v1.model.entities.Company;
import com.projectv1.project_v1.services.CompanyService;
import com.projectv1.project_v1.utils.CompanyUtils;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    public List<CompanyDto> getAllCompanyDto() {

        List<Company> companyList = this.companyRepository.findAll();
        List<CompanyDto> companyListDto = companyList.stream().map(u -> CompanyUtils.fromDVOtoDTO(u))
                .collect(Collectors.toList());

        return companyListDto;
    }

    @Override
    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    public CompanyDto getCompanyDtoById(Long id) {

        Company company = this.companyRepository.findById(id).get();
        CompanyDto companyDto = CompanyUtils.fromDVOtoDTO(company);

        return companyDto;
    }

}
