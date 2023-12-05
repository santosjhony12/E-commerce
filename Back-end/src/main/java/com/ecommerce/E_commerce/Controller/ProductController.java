package com.ecommerce.E_commerce.Controller;

import com.ecommerce.E_commerce.DTO.Product;
import com.ecommerce.E_commerce.Service.ProductService;
import org.apache.logging.log4j.util.ProcessIdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public void ProductService(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product newProduct = productService.saveProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
}
