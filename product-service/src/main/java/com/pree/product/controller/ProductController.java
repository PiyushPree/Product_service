package com.pree.product.controller;

import com.pree.product.entity.Product;
import com.pree.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService ps;

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return ps.addProduct(product);
    }
    @GetMapping
    public List<Product> findAll(){
        return ps.read();
    }
    @GetMapping("/{id}")
    public Product read(@PathVariable("id") Integer id){
        return ps.read(id);
    }
    @PutMapping
    public Product update(@RequestBody Product product){
        return ps.update(product);
    }
    @DeleteMapping("/{id}")
    public Product delete(@PathVariable("id") Integer id){
        return ps.delete(id);
    }

}
