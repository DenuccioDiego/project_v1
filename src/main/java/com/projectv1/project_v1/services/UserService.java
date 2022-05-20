package com.projectv1.project_v1.services;

import java.util.List;

import com.projectv1.project_v1.dto.UserDto;

public interface UserService {

    List<UserDto> getAllUserDto();

    UserDto getUserDto(Long id);

    Long saveUserDto(UserDto userDto);

    UserDto editUserDto(Long id, UserDto userDto);

    String deleteUserDto(Long id);

}
