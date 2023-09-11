package com.udemy.nelio.secao8.aula69;

public class Rectangle {

	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double Diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" 
			+ String.format("%.2f", width)
			+ ", height=" 
			+ String.format("%.2f", height)
			+ "]";
	}

}
