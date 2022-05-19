package com.projectv1.project_v1.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.projectv1.project_v1.dao.UserRepository;
import com.projectv1.project_v1.dto.UserDto;
import com.projectv1.project_v1.model.entities.User;
import com.projectv1.project_v1.services.UserService;
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

}
