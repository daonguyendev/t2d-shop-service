package com.codegym.t2dshop.repository;

import com.codegym.t2dshop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
