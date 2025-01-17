package com.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getCurrenncyConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		// setting variables to currency exchange service
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		// calling the currency-exchange-service
		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
				uriVariables);
		CurrencyConversionBean response = responseEntity.getBody();

		//return new CurrencyConversionBean(1L, from, to, BigDecimal.ONE, quantity, quantity, 8080);
		return new CurrencyConversionBean(response.getId(), response.getFrom(), response.getTo(), response.getTotalCalculatedAmount(), response.getQuantity(), response.getTotalCalculatedAmount(), 8080);
	}
}
