package com.example.producdemo;

import com.example.producdemo.domain.Product;
import com.example.producdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@RestController

@RequestMapping("product/v1")
public class ProductController {
    @Autowired
    private ProductService productService;

@GetMapping(value = "/names/{name}")
public List<Product> getProduct(@PathVariable String name) {
    return productService.findByName(name);
}



}
