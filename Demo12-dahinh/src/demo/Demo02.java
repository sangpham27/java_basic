package demo;

import entities.Animal;
import entities.Cat;
import entities.Chicken;
import entities.Duck;

public class Demo02 {

	public static void main(String[] args) {

		Animal animal1 = new Chicken("Ga 1");
		animal1.sound();
		animal1.move();
		
		Animal animal2 = new Cat("Meo 1");
		animal2.sound();
		animal2.move();
		
		Animal animal3 = new Duck("Vit 1");
		animal3.sound();
		animal3.move();
		
		System.out.println("===========================");
		
		Animal[] animals = new Animal[6];
		
		animals[0] = new Cat("Meo 2");
		animals[1] = new Chicken("Ga 2");
		animals[2] = new Duck("Vit 2");
		animals[3] = new Cat("Meo 3");
		animals[4] = new Chicken("Ga 3");
		animals[5] = new Duck("Vit 3");
		
		for(Animal animal : animals) {
			animal.sound();
			animal.move();
			System.out.println("--------------");
		}
		
		
	}

}
