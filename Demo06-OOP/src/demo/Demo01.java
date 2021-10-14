package demo;

import java.util.Scanner;

public class Demo01 {

	private static void menu1() {
		System.out.println("Menu 1 is selected !");
	}
	private static void menu2() {
		System.out.println("Menu 2 is selected !");
	}
	private static void menu3() {
		System.out.println("Menu 3 is selected !");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Menu 1");
		System.out.println("2. Menu 2");
		System.out.println("3. Menu 3");
		System.out.println("select: ");
		int menu = scanner.nextInt();
		if (menu==1) {
			menu1();
		} else if (menu==2) {
			menu2();
		} else if (menu==3) {
			menu3();
		} else {
			System.out.println("Invalid !");
		}
	}

}
