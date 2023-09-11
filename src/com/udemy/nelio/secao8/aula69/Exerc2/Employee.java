package com.udemy.nelio.secao8.aula69.Exerc2;

public class Employee {

	private String name;
	private double GrossSalary;
	private double tax;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return GrossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		GrossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return GrossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		GrossSalary += (GrossSalary * (percentage / 100)) - tax;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", GrossSalary=" + GrossSalary + ", tax=" + tax + "]";
	}
	
}
