package com.codegym.t2dshop.controller;

import com.codegym.t2dshop.payload.request.LoginRequest;
import com.codegym.t2dshop.payload.request.RegisterRequest;
import com.codegym.t2dshop.payload.response.LoginResponse;
import com.codegym.t2dshop.payload.response.RegisterResponse;
import com.codegym.t2dshop.service.LoginService;
import com.codegym.t2dshop.service.RegisterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private RegisterService registerService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = loginService.login(loginRequest);
        if (Optional.ofNullable(loginResponse.getToken()).isPresent()) {
            return new ResponseEntity<>(loginResponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(loginResponse, HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequest registerRequest) {
        RegisterResponse registerResponse = registerService.register(registerRequest);
        if (Optional.ofNullable(registerResponse.getData()).isPresent()) {
            return new ResponseEntity<>(registerResponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(registerResponse, HttpStatus.BAD_REQUEST);
    }
}
