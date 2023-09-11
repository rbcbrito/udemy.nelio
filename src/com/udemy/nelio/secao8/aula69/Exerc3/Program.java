package com.udemy.nelio.secao8.aula69.Exerc3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.setName(sc.nextLine());
		student.setScore1(sc.nextDouble());
		student.setScore2(sc.nextDouble());
		student.setScore3(sc.nextDouble());
		
		System.out.println();
		
		System.out.println("FINAL GRADE: " + String.format("%.2f", student.mediaScore()));
		System.out.println(student.passOurFailed());
		sc.close();
		
	}

}
