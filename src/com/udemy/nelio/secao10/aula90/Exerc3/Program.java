package com.udemy.nelio.secao10.aula90.Exerc3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double mediaAltura = 0.0;
		int count = 0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i + 1) + "° pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			Pessoa p = new Pessoa(nome, idade, altura);
			pessoas[i] = p;
		}
		
		System.out.print("Altura média: ");
		for(int i = 0; i < pessoas.length; i++) {
			mediaAltura += pessoas[i].getAltura();
		}
		mediaAltura /= pessoas.length;
		System.out.printf("%.2f%n", mediaAltura);
		
		System.out.print("Pessoas com menos de 16 anos: ");
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				count++;
			}
		}
		double porcentagem = 100 * count / pessoas.length;
		System.out.printf("%.1f%%%n", porcentagem);
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}
		
		sc.close();
		
	}

}
