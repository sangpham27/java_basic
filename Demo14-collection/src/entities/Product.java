package entities;

public class Product {
	private String id;
	private String name;
	private double price;
	
	public void output() {
		System.out.println("id: " + this.getId());
		System.out.println("name: " + this.getName());
		System.out.println("price: " + this.getPrice());
	}
	
	public Product() {
	}
	public Product(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
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
	
	
	
	
}
