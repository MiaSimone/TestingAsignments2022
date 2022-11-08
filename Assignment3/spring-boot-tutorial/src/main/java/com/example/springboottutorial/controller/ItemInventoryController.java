package com.example.springboottutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // shorthand for @Controller and @ResponseBody rolled together
public class ItemInventoryController {
    public ItemInventoryController() {
    }

    @RequestMapping( "/item" )
    public String getStockItem() {
        return "It's working...!";
    }

}