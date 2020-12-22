package io.mk.currencyrate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateController {

	@GetMapping("rate/{currency}")
	public float getCurrentRate(@PathVariable String currency) {
		switch (currency) {
		case "doller":
			return 73.92f;
		case "euro":
			return 89.95f;
		default:
			return 0;
		}
	}
}
