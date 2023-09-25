package com.udemy.nelio.secao14.Aula165.Exerc1;

public class Company extends Person{

	private Integer employees;
	private final Double taxMoreTen = 0.14;;
	private final Double taxMinusTen = 0.16;;
	
	public Company() {
		super();
	}

	public Company(String name, Double incomeAnual, Integer employees) {
		super(name, incomeAnual);
		this.employees = employees;
	}
	
	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double tax() {
		if(employees > 10) {
			return super.getIncomeAnual() * taxMoreTen;
		} else {
			return super.getIncomeAnual() * taxMinusTen;
		}
	}

}
