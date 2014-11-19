package br.com.acme.financialModule.api.converter.impl;

import javax.xml.ws.Endpoint;

import org.junit.Test;

public class CurrencyConverterServiceTest {

	@Test
	public void shouldReturnOne() {
		Endpoint.publish("http://localhost:8080/financial/currencyConverter", new CurrencyConverterService());
		System.out.println("");
	}
}
