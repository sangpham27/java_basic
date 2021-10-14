package entities;

public class Duck extends Animal{
	
	public Duck(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		System.out.println("Con vit: "+ this.getName() + " boi");
	}

	@Override
	public void sound() {
		System.out.println("Con vit: "+ this.getName() + " Keu cap cap!");
	}
	
}
