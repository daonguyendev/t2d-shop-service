package com.codegym.t2dshop.service.impl;

import com.codegym.t2dshop.payload.request.LoginRequest;
import com.codegym.t2dshop.payload.response.LoginResponse;
import com.codegym.t2dshop.security.TokenProvider;
import com.codegym.t2dshop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenProvider tokenProvider;

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        try {
            // Authenticate login info
            UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                    loginRequest.getLoginDto().getUsername(),
                    loginRequest.getLoginDto().getPassword());
            Authentication authentication = authenticationManager.authenticate(authToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);

            // Generate token
            String token = tokenProvider.generateToken(authentication);
            return new LoginResponse("Login successfully!", token);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new LoginResponse("Login failed!", null);
    }
}
