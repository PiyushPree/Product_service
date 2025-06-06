package com.pree.product.service;

import com.pree.product.entity.Product;
import com.pree.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository pr;

    public Product addProduct(Product product){
        return pr.save(product);
    }
    public List<Product> read(){
        return pr.findAll();
    }
    public Product read(Integer id){
        Optional<Product> temp = pr.findById(id);
        Product p = null;
        if(temp.isPresent()){
            p = temp.get();
        }
        return p;
    }
    public Product update(Product product){
        Product temp = read(product.getId());
        if(temp != null){
            temp = product;
            pr.save(temp);
        }
        return temp;
    }

    public Product delete(Integer id){
        Product temp = read(id);
        if(temp != null){
            pr.delete(temp);
        }
        return temp;
    }
}
