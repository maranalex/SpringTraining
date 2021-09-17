package ro.msg.learning.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ro.msg.learning.shop.entities.ProductEntity;
import ro.msg.learning.shop.repositories.ProductRepository;

import java.util.List;

@Controller
@RequestMapping(path = "/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping()
    public @ResponseBody
    List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping()
    public @ResponseBody
    String addProduct() {
//        ProductEntity newProduct = new ProductEntity();
        return "";
    }

}
