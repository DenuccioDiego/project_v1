package com.projectv1.project_v1.controllers;

import java.util.List;

import com.projectv1.project_v1.dto.UserDto;
import com.projectv1.project_v1.services.UserService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        return userService.getAllUserDto();
    }

    @GetMapping("/{userId}")
    public UserDto getUserById(@PathVariable("userId") Long id) {
        return userService.getUserDto(id);
    }

    @PostMapping
    public Long saveUser(@RequestBody UserDto userDto) {
        return userService.saveUserDto(userDto);
    }

    @PutMapping("/{userId}")
    public UserDto editUser(@PathVariable("userId") Long id, @RequestBody UserDto userDto) {
        return userService.editUserDto(id, userDto);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") Long id) {
        return userService.deleteUserDto(id);
    }

}
