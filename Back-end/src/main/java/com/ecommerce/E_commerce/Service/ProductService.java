package com.ecommerce.E_commerce.Service;

import com.ecommerce.E_commerce.DTO.Product;
import com.ecommerce.E_commerce.Repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
}
