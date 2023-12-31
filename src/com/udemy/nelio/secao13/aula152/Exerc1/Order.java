package com.udemy.nelio.secao13.aula152.Exerc1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		for (OrderItem i : items) {
			sum += i.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf2.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		for (OrderItem o : items) {
			sb.append(o + "\n");
		}
		sb.append("Total price: " + String.format("%.2f", total()));	
		return sb.toString();
	}
	
}
