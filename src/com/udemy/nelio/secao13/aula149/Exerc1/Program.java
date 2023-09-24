package com.udemy.nelio.secao13.aula149.Exerc1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = sc.next();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int numberContracts = sc.nextInt();
		
		for(int i = 0; i < numberContracts; i++) {
			System.out.println("Enter contract #" + (i+1) + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuerPerHour= sc.nextDouble();
			System.out.print("Duration (hours):");
			Integer hours = sc.nextInt();
			HourContract hourContract = new HourContract(date, valuerPerHour, hours);
			worker.addContract(hourContract);
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthYear = sc.next();
		String[] monthAndYear = monthYear.split("/");
		Double income = worker.income(Integer.parseInt(monthAndYear[1]), Integer.parseInt(monthAndYear[0]));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthYear + ": " + income);
		
		sc.close();
		
	}

}