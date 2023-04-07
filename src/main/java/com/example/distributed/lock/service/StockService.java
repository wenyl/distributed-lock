package com.example.distributed.lock.service;

import com.example.distributed.lock.pojo.Stock;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    private Stock stock = new Stock();

    public void deStock(){
        stock.setStock(stock.getStock()-1);
        System.out.println("库存余量---------"+stock.getStock());
    }
}
