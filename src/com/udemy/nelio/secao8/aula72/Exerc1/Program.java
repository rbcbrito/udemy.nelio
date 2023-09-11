package com.udemy.nelio.secao8.aula72.Exerc1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price: ");
		double priceDollar = sc.nextDouble();
		System.out.println();
		
		System.out.print("How many dollars will be bought? ");
		double valueDollars = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converterInDollars(priceDollar, valueDollars));
		
		sc.close();
		
	}

}
