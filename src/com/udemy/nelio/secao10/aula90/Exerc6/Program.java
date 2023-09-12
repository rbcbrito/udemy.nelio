package com.udemy.nelio.secao10.aula90.Exerc6;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB= new int[n];
		int[] vectC = new int[n];
		
		System.out.println("DIGITE OS VALORES DO VETOR A: ");
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("DIGITE OS VALORES DO VETOR B: ");
		for(int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < vectC.length; i++) {
			System.out.println(vectC[i]);
		}
		
		sc.close();
		
	}

}
