package com.codegym.t2dshop.repository;

import com.codegym.t2dshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
