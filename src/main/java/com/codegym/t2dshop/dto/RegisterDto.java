package com.codegym.t2dshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
    private UserDto userDto;
    private RoleDto roleDto;
}
