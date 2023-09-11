package com.udemy.nelio.secao8.aula69.Exerc1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.setWidth(sc.nextDouble());
		rectangle.setHeight(sc.nextDouble());
		System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.Diagonal()));
		
		sc.close();
		
	}

}
