package com.example.bitcoinpriceapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class BitcoinPriceService {
    private final RestTemplate restTemplate = new RestTemplate();

    public String getBitcoinPrice() {
        String url = "https://api.coindesk.com/v1/bpi/currentprice/BTC.json";
        return restTemplate.getForObject(url, String.class);
    }
}
