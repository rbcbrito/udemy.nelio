package com.udemy.nelio.secao8.aula72.Exerc1;

public class CurrencyConverter {
	
	private static double iof = 0.06;
	
	public static double converterInDollars(double priceDollar, double valueInReais) {
		double valueConverted = priceDollar * valueInReais;
		double valueConvertedMoreIof = valueConverted + (valueConverted * iof);
		return valueConvertedMoreIof;
	}
	
}
