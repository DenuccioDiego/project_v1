package com.projectv1.project_v1.controllers;

import java.util.List;

import com.projectv1.project_v1.dto.UserDto;
import com.projectv1.project_v1.services.UserService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(@Qualifier("pippo") UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDto> getAllUsers() {
        List<UserDto> listUsers = userService.getAllUserDto();
        return listUsers;
    }

}
