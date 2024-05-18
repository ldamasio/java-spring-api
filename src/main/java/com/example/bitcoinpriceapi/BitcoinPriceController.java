package com.example.bitcoinpriceapi;

import com.example.bitcoinpriceapi.service.BitcoinPriceService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BitcoinPriceController {
    
    @Autowired
    private BitcoinPriceService bitcoinPriceService;

    @GetMapping("/bitcoin-price")
    public String getBitcoinPrice() {
        return bitcoinPriceService.getBitcoinPrice();
    }
}
