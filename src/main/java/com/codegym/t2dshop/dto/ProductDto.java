package com.codegym.t2dshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private String name;
    private Integer price;
    private String description;
    private int quantity;
}