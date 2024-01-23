package com.codegym.t2dshop.controller;

import com.codegym.t2dshop.entity.Category;
import com.codegym.t2dshop.entity.Product;
import com.codegym.t2dshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/{id}/products")
    public ResponseEntity<List<Product>> getProductsByCategoryId(@PathVariable Long id) {
        Category category = categoryService.getCategoryById(id);
        if (category == null) {
            System.out.println("getProductsByCategoryId null");
            return ResponseEntity.notFound().build();
        }
        System.out.println(category);
        return ResponseEntity.ok(category.getProducts());
    }
}

