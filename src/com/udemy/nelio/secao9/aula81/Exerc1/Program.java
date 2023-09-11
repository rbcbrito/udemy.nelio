package com.udemy.nelio.secao9.aula81.Exerc1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter Account holder: ");
		sc.nextLine();
		String nameHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char opcao = sc.next().charAt(0);
		
		if(opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(accountNumber, nameHolder, initialDeposit);
		} else {
			conta = new Conta(accountNumber, nameHolder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		conta.depositar(deposit);
		System.out.println("Update account data: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		conta.sacar(withdraw);
		System.out.println("Update account data: ");
		System.out.println(conta);
		System.out.println();
		
		sc.close();
		
	}

}
