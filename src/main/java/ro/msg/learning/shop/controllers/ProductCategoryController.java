package ro.msg.learning.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ro.msg.learning.shop.entities.ProductCategoryEntity;
import ro.msg.learning.shop.repositories.ProductCategoryRepository;

@Controller
@RequestMapping(path = "/supplier")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewSupplier(@RequestParam String supplierName, @RequestParam String supplierDescription){
        ProductCategoryEntity newSupplier = new ProductCategoryEntity();
        newSupplier.setName(supplierName);
        newSupplier.setDescription(supplierDescription);
        productCategoryRepository.save(newSupplier);
        return "success";
    }
}
