package com.codegym.t2dshop.controller;

import com.codegym.t2dshop.entity.Category;
import com.codegym.t2dshop.entity.Product;
import com.codegym.t2dshop.repository.ProductRepository;
import com.codegym.t2dshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/{id}/products")
    public ResponseEntity<?> getProductsByCategoryId(@PathVariable Long id) {
        Category category = categoryService.getCategoryById(id);
        if (Optional.ofNullable(category.getProducts()).isPresent()) {
            return new ResponseEntity<>(category, HttpStatus.OK);
        }
        return new ResponseEntity<>(category, HttpStatus.BAD_REQUEST);
    }
}

