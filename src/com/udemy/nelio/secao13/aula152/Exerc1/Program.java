package com.udemy.nelio.secao13.aula152.Exerc1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		OrderItem item = null;
		Product product;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		Client client = new Client(name, email, sdf.parse(birthDate));
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("Enter many times to this order? ");
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		int numberOrder = sc.nextInt();
		
		for(int i = 1; i <= numberOrder; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			product = new Product(productName, productPrice);
			item = new OrderItem(quantity, productPrice, product);
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order.toString());
		
		sc.close();
	}

}
