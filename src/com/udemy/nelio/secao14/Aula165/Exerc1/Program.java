package com.udemy.nelio.secao14.Aula165.Exerc1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double totalTax = 0.0;
		
		List<Person> persons = new ArrayList<Person>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payers #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name= sc.next();
			System.out.print("Anual Income: ");
			double AnualIncome= sc.nextDouble();
			switch(type) {
				case 'i':
					System.out.print("Health expenditures: ");
					double healthExpenditures = sc.nextDouble();
					persons.add(new Individual(name, AnualIncome, healthExpenditures));
					break;
				case 'c':
					System.out.print("Number of Eemployees: ");
					int numberEmployees= sc.nextInt();
					persons.add(new Company(name, AnualIncome, numberEmployees));
					break;
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Person p : persons) {
			totalTax += p.tax();
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.tax()));
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + totalTax);
		sc.close();
	}

}
