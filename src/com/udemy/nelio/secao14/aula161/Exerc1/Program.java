package com.udemy.nelio.secao14.aula161.Exerc1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? "); 
			char isOutSourced = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHours = sc.nextDouble();
			if(isOutSourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHours));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee e : list) {
			System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
		}
		
		sc.close();
		
	}

}
