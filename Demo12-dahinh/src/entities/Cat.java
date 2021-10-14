package entities;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		System.out.println("Con meo: "+ this.getName() + " chay");
	}

	@Override
	public void sound() {
		System.out.println("Con meo: "+ this.getName() + " keu meo meo!");
	}
	
}
