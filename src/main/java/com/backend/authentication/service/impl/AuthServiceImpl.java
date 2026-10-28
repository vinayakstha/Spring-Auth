package com.backend.authentication.service.impl;

import com.backend.authentication.dto.UserDto;
import com.backend.authentication.service.AuthService;
import com.backend.authentication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserService userService;

    @Override
    public UserDto registerUser(UserDto userDto) {
        UserDto userDto1 = userService.createUser(userDto);
        return userDto1;
    }
}
