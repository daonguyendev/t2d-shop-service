package com.codegym.t2dshop.payload.request;

import com.codegym.t2dshop.dto.LoginDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    private LoginDto loginDto;
}
