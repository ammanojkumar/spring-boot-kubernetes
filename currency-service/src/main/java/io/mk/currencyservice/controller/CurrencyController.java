package io.mk.currencyservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${currency.rate.url}")
	private String rateUrl;

	@GetMapping("usd2inr/{usd}")
	public String conertInrToUsd(@PathVariable int usd) {
		Float usdRate = restTemplate.getForObject(rateUrl + "/doller", Float.class);
		return "$" + usd + " = Rs." + usd * usdRate;
	}

	@GetMapping("euro2inr/{euro}")
	public String conertInrToEuro(@PathVariable int euro) {
		Float euroRate = restTemplate.getForObject(rateUrl + "/euro", Float.class);
		return "E" + euro + " = Rs." + euro * euroRate;
	}
}
