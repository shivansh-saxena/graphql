package org.shiv.graphql.service;

import org.shiv.graphql.entity.Product;
import org.shiv.graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public  List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }
}
