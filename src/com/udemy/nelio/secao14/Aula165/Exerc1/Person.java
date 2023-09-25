package com.udemy.nelio.secao14.Aula165.Exerc1;

public abstract class Person {

	private String name;
	private Double incomeAnual;
	
	public Person() {
	}

	public Person(String name, Double incomeAnual) {
		this.name = name;
		this.incomeAnual = incomeAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncomeAnual() {
		return incomeAnual;
	}

	public void setIncomeAnual(Double incomeAnual) {
		this.incomeAnual = incomeAnual;
	}
	
	public abstract Double tax();
	
}
