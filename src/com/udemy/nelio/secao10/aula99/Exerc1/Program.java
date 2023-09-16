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
			while(hasId(employees, id)) {
				System.out.println("Id already taken, try again!");
				id = sc.nextInt();
			}
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
		Employee emp = employees.stream().filter(x -> x.getId() == idIncreaseSalary).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id doesn't exist!");
		} else {
			System.out.print("Enter the percentage: ");
			emp.increaseSalary(sc.nextDouble());
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee : employees) {
			System.out.println(employee.getId() + ", " + employee);
		}
		
		sc.close();
		
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}	

}
