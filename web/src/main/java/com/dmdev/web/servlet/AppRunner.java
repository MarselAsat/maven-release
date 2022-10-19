package com.dmdev.web.servlet;



import com.dmdev.service.dto.UserDto.UserDto;
import com.dmdev.service.service.UserService;

import java.util.Optional;

public class AppRunner {
    private static UserService userService = new UserService();

    public static void main(String[] args) {
        Optional<UserDto> user = userService.getUser(1L);
        System.out.println(user);
    }
}
