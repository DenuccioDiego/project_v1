package com.projectv1.project_v1.controllers;

import java.util.List;

import com.projectv1.project_v1.dto.UserDto;
import com.projectv1.project_v1.services.UserService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(@Qualifier("pippoUserService") UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDto> getAllUsers() {
        List<UserDto> listUsers = userService.getAllUserDto();
        return listUsers;
    }

    @GetMapping("/{userId}")
    public UserDto getUserById(@PathVariable("userId") Long id) {
        UserDto user = userService.getUserDto(id);
        return user;
    }

}
