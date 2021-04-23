package za.co.coffeeshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.coffeeshop.service.CoffeeShopService;

@RequestMapping("/orders")
public class OrdersController {

    private final CoffeeShopService coffeeShopService;

    @Autowired
    public OrdersController(CoffeeShopService coffeeShopService) {
        this.coffeeShopService = coffeeShopService;
    }
}
