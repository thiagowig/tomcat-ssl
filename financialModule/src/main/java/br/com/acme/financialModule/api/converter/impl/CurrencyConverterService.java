package br.com.acme.financialModule.api.converter.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class CurrencyConverterService {
	
	private static final double COTATION = 2.58;
	
	public double convertBrazilianRealInAmericanDollar(double brazilianRealValue) {
		return brazilianRealValue / COTATION;
	}
	
	public double convertAmericanDollarInBrazilianReal(double americanDollarValue) {
		return americanDollarValue * COTATION;
	}
	
}
