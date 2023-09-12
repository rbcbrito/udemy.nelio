package com.udemy.nelio.secao10.aula90.Exerc5;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int pos = 0;
		double x = 0.0;
		
		System.out.print("Quantos numeros voce vai digita? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] > x) {
				x = vect[i];
				pos = i;
			}
		}
		System.out.print("MAIOR VALOR = " + String.format("%.1f", x) + "\n");
		System.out.println("POSICAO DO MAIOR VALOR = " + pos);
		
		
		sc.close();
		
	}

}
