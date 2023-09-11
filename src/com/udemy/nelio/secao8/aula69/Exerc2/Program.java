package com.udemy.nelio.secao8.aula69.Exerc2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.setName(sc.nextLine());
		System.out.print("Gross salary: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.print("Tax: ");
		employee.setTax(sc.nextDouble());
		System.out.println();
		
		System.out.print("Employee: " + employee.getName() + ", R$ " + String.format("%.2f", employee.netSalary()));
		System.out.println();
		
		System.out.print("Which percentage to increse salary: ");
		employee.increaseSalary(sc.nextDouble());
		System.out.println();
		System.out.println("Update data: " + employee.getName() + ", R$ " + (employee.getGrossSalary()));
		
		sc.close();
		
	}

}
