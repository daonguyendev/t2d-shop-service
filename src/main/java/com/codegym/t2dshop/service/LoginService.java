package com.codegym.t2dshop.service;

import com.codegym.t2dshop.payload.request.LoginRequest;
import com.codegym.t2dshop.payload.response.LoginResponse;

public interface LoginService {

    LoginResponse login(LoginRequest loginRequest);
}
