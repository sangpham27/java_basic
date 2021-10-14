package demo;

import entities.Human;
import entities.IHuman;
import entities.IHuman2;
import entities.IHuman3;
import entities.IHuman4;

public class Demo01 {

	public static void main(String[] args) {

		IHuman iHuman = new Human();
		iHuman.eat();
		iHuman.sleep();
		
		IHuman2 iHuman2 = new Human();
		iHuman2.run();
		
		IHuman3 iHuman3 = new Human();
		iHuman3.action2();
		iHuman3.action4();
		iHuman3.action6();
		
		IHuman4 iHuman4 = new Human();
		iHuman4.action3();
		iHuman4.action4();

	}

}
