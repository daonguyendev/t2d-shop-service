package com.codegym.t2dshop.repository;

import com.codegym.t2dshop.entity.Category;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Nonnull
    Optional<Category> findById(@Nonnull Long id);
}
