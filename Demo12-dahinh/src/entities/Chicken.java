package entities;

public class Chicken extends Animal{
	
	public Chicken(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		System.out.println("Con ga: "+ this.getName() + " chay");
	}

	@Override
	public void sound() {
		System.out.println("Con ga: "+ this.getName() + " Gay O o o!");
	}
	
	

}
