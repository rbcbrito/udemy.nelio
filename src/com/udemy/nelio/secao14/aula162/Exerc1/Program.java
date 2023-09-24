package com.udemy.nelio.secao14.aula162.Exerc1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name= sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			switch(type){
				case 'c':
					list.add(new Product(name, price));
					break;
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					String date = sc.next();
					list.add(new UsedProduct(name, price, UsedProduct.sdf.parse(date)));
					break;
				case 'i':
					System.out.print("Custem fee: ");
					double fee= sc.nextDouble();
					list.add(new ImportedProduct(name, price, fee));
					break;
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
