package com.example.demo2.controller;

import com.example.demo2.entity.Product;
import com.example.demo2.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService Service;

    @PostMapping("/Product")
    public Product addProduct(@RequestBody Product product) {
        return Service.save(product);
    }
    @PostMapping("/Products")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return Service.saveProducts(products);
    }
    @GetMapping("/Product")
    public List<Product> getProducts() {
        return Service.findAll();
    }
    @GetMapping("/ProductById/{id}")
    public Product findProductById(@PathVariable int id) {
        return Service.getProductById(id);
    }
    @GetMapping("/Product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return Service.getProductByName(name);
    }
    @DeleteMapping("/ProductById/{id}")
    public String DeleteProductById(@PathVariable int id) {
        return Service.deleteProductById(id);
    }
    @PutMapping("/Product")
    public Product updateProduct(@RequestBody Product product) {
        return Service.save(product);
    }
}
