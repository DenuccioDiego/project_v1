package com.projectv1.project_v1.utils;

import com.projectv1.project_v1.dto.UserDto;
import com.projectv1.project_v1.model.entities.Company;
import com.projectv1.project_v1.model.entities.User;

public class UserUtils {

    public static UserDto fromDVOtoDTO(User userDvo, Company companyDvo) {

        UserDto dto = new UserDto();

        dto.setName(userDvo.getName());
        dto.setSurname(userDvo.getSurname());
        dto.setId(userDvo.getId());
        dto.setCompanyId(companyDvo.getId());
        return dto;
    }

    public static User fromDTOtoDVO(UserDto user) {

        return null;
    }
}