package com.udemy.nelio.secao10.aula90.Exerc7;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double maiorAltura = 0.0;
		double menorAltura = 100.0;
		double mediaAlturaMulheres = 0.0;
		double soma = 0.0;
		int count = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char genero = sc.next().charAt(0);
			pessoas[i] = new Pessoa(altura, genero);
		}
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getSexo() == 'F') {
				soma += pessoas[i].getAltura();
				count++;
			}
			if(pessoas[i].getAltura() > maiorAltura) {
				maiorAltura = pessoas[i].getAltura();
			} 
			if(pessoas[i].getAltura() < menorAltura) {
				menorAltura = pessoas[i].getAltura();
			}
		}
		
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);
		mediaAlturaMulheres = soma / count;
		System.out.printf("Media das alturas das mulheres = %.2f%n ", mediaAlturaMulheres);
		System.out.println("Numero de homens = " + (pessoas.length - count));
		
		sc.close();
		
	}

}
