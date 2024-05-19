package com.example.bitcoinpriceapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.google.gson.Gson;
import com.google.gson.JsonObject;


@Service
public class BitcoinPriceService {
    private final RestTemplate restTemplate = new RestTemplate();

    public String getBitcoinPrice() {
        String url = "https://api.coindesk.com/v1/bpi/currentprice/BTC.json";
        String response = restTemplate.getForObject(url, String.class);
        JsonObject jsonObject = new Gson().fromJson(response, JsonObject.class);
        String priceInUSD = jsonObject.getAsJsonObject("bpi").getAsJsonObject("USD").get("rate").getAsString();
        return priceInUSD; 
    }
}
