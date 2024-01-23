package com.codegym.t2dshop.service;

import com.codegym.t2dshop.payload.request.RegisterRequest;
import com.codegym.t2dshop.payload.response.RegisterResponse;

public interface RegisterService {

    RegisterResponse register(RegisterRequest registerRequest);
}
