package entities;

import java.util.Scanner;

public class Product {
	
	private String id;
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(String id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void display() {
		System.out.println("id: "+ this.id);
		System.out.println("name: "+ this.name);
		System.out.println("price: "+ this.price);
		System.out.println("quantity: "+ this.quantity);
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap id: ");
		this.id = scanner.nextLine();		
		System.out.print("Nhap name: ");
		this.name = scanner.nextLine();
		System.out.print("Nhap price: ");
		this.price = scanner.nextDouble();
		System.out.print("Nhap quantity: ");
		this.quantity = scanner.nextInt();
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
