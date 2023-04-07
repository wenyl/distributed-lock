package com.example.distributed.lock.controller;

import com.example.distributed.lock.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Resource
    private StockService stockService;

    @GetMapping("/deStock")
    public String deStock(){
        stockService.deStock();
        return "hello stock deStock";
    }
}
