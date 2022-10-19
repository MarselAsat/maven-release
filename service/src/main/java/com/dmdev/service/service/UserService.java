package com.dmdev.service.service;

import com.dmdev.service.dto.UserDto.UserDto;

import java.util.Optional;

public class UserService {
    public Optional<UserDto> getUser(Long id){
        return Optional.of(new UserDto());
    }
}
