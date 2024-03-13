package com.codegym.t2dshop.service;

import com.codegym.t2dshop.entity.Product;

public interface CartService {
        void addProductToCart(Product product);
        void removeProductFromCart(Product product);
}
