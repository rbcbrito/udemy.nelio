package com.udemy.nelio.secao10.aula90.Exerc2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digita? ");
		int n = sc.nextInt();
		
		double sum = 0;
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES =");
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print(" " + vect[i]);
			sum += vect[i];
		}
		
		System.out.println("\nSOMA = " + String.format("%.2f", sum));
		System.out.println("MEDIA = " + String.format("%.2f", sum /= vect.length));
		
		sc.close();
		
	}

}
