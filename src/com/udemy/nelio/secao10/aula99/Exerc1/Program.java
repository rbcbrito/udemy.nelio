package com.udemy.nelio.secao10.aula99.Exerc1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> employees = new ArrayList<Employee>();
		
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary= sc.nextDouble();
			System.out.println();
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer idIncreaseSalary = sc.nextInt();
		System.out.print("Enter the percentage: ");
		Double percentage = sc.nextDouble();
		
		
		for(Employee employee : employees) {
			if(employee.getId().equals(idIncreaseSalary)) {
				employee.increaseSalary(percentage);
			}
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee : employees) {
			System.out.println(employee.getId() + ", " + employee);
		}
		
		sc.close();
		
	}

}
