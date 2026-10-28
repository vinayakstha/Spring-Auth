package com.backend.authentication.service;

import com.backend.authentication.dto.UserDto;

public interface AuthService {
    UserDto registerUser(UserDto userDto);
}
