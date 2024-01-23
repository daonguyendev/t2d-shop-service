package com.codegym.t2dshop.payload.response;

import com.codegym.t2dshop.dto.RegisterDto;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResponse {

    @NotBlank
    private String message;

    @Nullable
    private RegisterDto data;
}
