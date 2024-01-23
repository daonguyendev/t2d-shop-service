package com.codegym.t2dshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusType {
    IS_ACTIVATED(true),
    NOT_ACTIVATED(false);

    private final Boolean isActivated;
}
