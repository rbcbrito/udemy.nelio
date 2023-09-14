package com.udemy.nelio.secao10.aula93.Exerc1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(sdf.format(date));
		Scanner sc = new Scanner(System.in);
		
		Hospede[] quartos = new Hospede[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1) + ": ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			Quarto numeroQuarto = new Quarto(quarto);
			quartos[quarto] = new Hospede(name, email, numeroQuarto);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(quartos[i].getQuarto().getQuarto() + ": " + quartos[i]);
			}
		}
		
		sc.close();
		
	}

}
