package com.udemy.nelio.secao10.aula93.Exerc1;

public class Hospede {

	private String nome;
	private String email;
	private Quarto quarto;
	
	public Hospede(String nome, String email, Quarto quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
		
	public Quarto getQuarto() {
		return quarto;
	}

	@Override
	public String toString() {
		return nome + ", " + email;
	}
	
	
	
}
