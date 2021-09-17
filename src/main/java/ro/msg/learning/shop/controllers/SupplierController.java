package ro.msg.learning.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ro.msg.learning.shop.entities.SupplierEntity;
import ro.msg.learning.shop.repositories.SupplierRepository;

@Controller
@RequestMapping(path = "/supplier")
public class SupplierController {
    @Autowired
    private SupplierRepository supplierRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewSupplier(@RequestParam String supplierName) {
        SupplierEntity newSupplier = new SupplierEntity();
        newSupplier.setName(supplierName);
        supplierRepository.save(newSupplier);
        return "success";
    }
}
