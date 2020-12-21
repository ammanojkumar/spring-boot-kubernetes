package io.mk.currencyservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

	@GetMapping("usd2inr/{usd}")
	public String conertInrToUsd(@PathVariable int usd) {
		return "$" + usd + " = Rs." + usd * 75;
	}

	@GetMapping("euro2inr/{euro}")
	public String conertInrToEuro(@PathVariable int euro) {
		return "E" + euro + " = Rs." + euro * 85;
	}
}
