package com.udemy.nelio.secao9.aula81.Exerc1;

public class Conta {

	private int numeroConta;
	private String nomeTitular;
	private double valorConta;
	private double taxa = 5.0;
	
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public Conta(int numeroConta, String nomeTitular, double valorInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		depositar(valorInicial);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getValorConta() {
		return valorConta;
	}
	
	public void sacar(double valor) {
		if(this.valorConta >= valor + taxa) {
			this.valorConta -= valor;
			this.valorConta -= taxa;
		} else {
			System.out.println("Valor insuficiente para saque!");
		}
	}
	
	public void depositar(double valor) {
		this.valorConta += valor;
	}

	@Override
	public String toString() {
		return "Account "
				+ numeroConta
				+ ", Holder: "
				+ nomeTitular
				+ ", Balance: "
				+ String.format("%.2f", valorConta);
	}
	
	
	
}
