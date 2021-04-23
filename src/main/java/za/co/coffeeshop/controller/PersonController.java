package za.co.coffeeshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.coffeeshop.service.CoffeeShopService;

@RequestMapping("/login")
public class PersonController {

    private  final CoffeeShopService coffeeShopService;

    @Autowired
    public PersonController(CoffeeShopService coffeeShopService) {
        this.coffeeShopService = coffeeShopService;
    }
}
