package entities;

public class Product {
	private String id;
	private String name;
	private double price;
	private int quantity;
	private String category;
	
	public double total() {
		return this.getPrice()*this.getQuantity();
	}
	
	public void output() {
		System.out.println("\tid: "+ this.getId());
		System.out.println("\tname: "+ this.getName());
		System.out.println("\tprice: "+ this.getPrice());
		System.out.println("\tquantity: "+ this.getQuantity());
		System.out.println("\tcategory: "+ this.getCategory());
		System.out.println("\t============");
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String id, String name, double price, int quantity, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
