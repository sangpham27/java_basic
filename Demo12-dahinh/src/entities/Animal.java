package entities;

public abstract class Animal {
	private String name;
	
	public void output() {
		System.out.println("animal name: " + this.name);
	}
	
	public abstract void move();
	
	public abstract void sound();

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
