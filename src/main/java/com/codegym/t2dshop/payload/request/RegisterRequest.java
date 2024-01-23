package com.codegym.t2dshop.payload.request;

import com.codegym.t2dshop.dto.RegisterDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private RegisterDto registerDto;
}
