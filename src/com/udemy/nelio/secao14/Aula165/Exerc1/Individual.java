package com.udemy.nelio.secao14.Aula165.Exerc1;

public class Individual extends Person{

	private Double healthExpeditures;
	private final Double limit = 20000.00;
	private final Double taxMinimum = 0.15;
	private final Double taxMaximum = 0.25;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double incomeAnual, Double healthExpeditures) {
		super(name, incomeAnual);
		this.healthExpeditures = healthExpeditures;
	}

	public Double getHealthExpeditures() {
		return healthExpeditures;
	}

	public void setHealthExpeditures(Double healthExpeditures) {
		this.healthExpeditures = healthExpeditures;
	}

	@Override
	public Double tax() {
		if(super.getIncomeAnual() < limit){
			if(healthExpeditures > 0.0) {
				return super.getIncomeAnual() * taxMinimum - healthExpeditures * 0.50;
			} else {
				return super.getIncomeAnual() * taxMinimum;
			}
		} else {
			if(healthExpeditures > 0.0) {
				return super.getIncomeAnual() * taxMaximum - healthExpeditures * 0.50;
			} else {
				return super.getIncomeAnual() * taxMaximum;
			}
		}
	}

}
