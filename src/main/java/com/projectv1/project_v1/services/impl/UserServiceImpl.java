package com.projectv1.project_v1.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.projectv1.project_v1.dao.UserRepository;
import com.projectv1.project_v1.dto.CompanyDto;
import com.projectv1.project_v1.dto.UserDto;
import com.projectv1.project_v1.dto.UserLogin;
import com.projectv1.project_v1.model.entities.User;
import com.projectv1.project_v1.services.UserService;
import com.projectv1.project_v1.utils.CompanyUtils;
import com.projectv1.project_v1.utils.UserUtils;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Qualifier("pippoUserService")
@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    public List<UserDto> getAllUserDto() {

        List<User> listUser = this.userRepository.findAll();
        List<UserDto> listUserDto = listUser.stream().map(u -> UserUtils.fromDVOtoDTO(u, u.getCompany()))
                .collect(Collectors.toList());

        return listUserDto;
    }

    @Override
    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    public UserDto getUserDto(Long id) {

        User user = this.userRepository.findById(id).get();
        UserDto userDto = UserUtils.fromDVOtoDTO(user, user.getCompany());

        return userDto;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Long saveUserDto(UserDto userDto) {

        CompanyDto companyDto = CompanyUtils.fromDVOtoDTO(userDto.getCompany());
        User user = UserUtils.fromDTOtoDVO(userDto, companyDto);

        userRepository.save(user);
        return user.getId();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public UserDto editUserDto(Long id, UserDto userDto) {

        User user = UserUtils.fromDTOtoDVO(userDto, CompanyUtils.fromDVOtoDTO(userDto.getCompany()));
        userRepository.saveAndFlush(user);
        return userDto;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public String deleteUserDto(Long id) {
        userRepository.deleteById(id);
        return "User delete";
    }

    @Override
    public UserDto getUserByNameAndPassword(UserLogin userLogin) {
        // TODO Auto-generated method stub
        return null;
    }

}
