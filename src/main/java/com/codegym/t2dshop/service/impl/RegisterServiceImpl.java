package com.codegym.t2dshop.service.impl;

import com.codegym.t2dshop.dto.*;
import com.codegym.t2dshop.entity.Role;
import com.codegym.t2dshop.entity.User;
import com.codegym.t2dshop.payload.request.RegisterRequest;
import com.codegym.t2dshop.payload.response.RegisterResponse;
import com.codegym.t2dshop.repository.RoleRepository;
import com.codegym.t2dshop.repository.UserRepository;
import com.codegym.t2dshop.service.RegisterService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        UserDto userDto = registerRequest.getRegisterDto().getUserDto();

        if (!isEmailOrPhoneExisted(userDto)) {
            return new RegisterResponse("Register failed!", null);
        } else {
            User newUser = modelMapper.map(userDto, User.class);
            newUser.setIsActivated(StatusType.IS_ACTIVATED.getIsActivated());
            String password = bCryptPasswordEncoder.encode(newUser.getPassword());
            newUser.setPassword(password);

            Role userRole = roleRepository.findById(RoleType.ROLE_USER.getId()).orElse(null);
            newUser.setRole(userRole);

            User userCreated = userRepository.save(newUser);
            UserDto userDtoCreated = modelMapper.map(userCreated, UserDto.class);
            RoleDto roleDtoCreated = modelMapper.map(userRole, RoleDto.class);

            RegisterDto registerDto = new RegisterDto(userDtoCreated, roleDtoCreated);
            return new RegisterResponse("Register successfully!", registerDto);
        }
    }

    private boolean isEmailOrPhoneExisted(UserDto newUserDto) {
        User currentUser = userRepository.findByUsername(newUserDto.getUsername()).orElse(null);
        return Optional.ofNullable(currentUser).isEmpty();
    }
}
