package com.codegym.t2dshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum RoleType {
    ROLE_ADMIN(1L, "ROLE_ADMIN"),
    ROLE_USER(2L, "ROLE_USER");

    private final Long id;
    private final String name;
}
