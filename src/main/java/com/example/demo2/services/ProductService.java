package com.example.demo2.services;

import com.example.demo2.entity.Product;
import com.example.demo2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }
    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }
    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }
    public String deleteProductById(int id) {
        productRepository.deleteById(id);
        return "Product deleted";
    }
    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        return productRepository.save(existingProduct);
    }
}
