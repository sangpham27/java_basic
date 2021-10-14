package demo;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Menu 1");
		System.out.println("2. Menu 2");		
		System.out.println("3. Menu 3");	
		System.out.print("Select: ");
		int menu = scanner.nextInt();
		if (menu == 1) {
			System.out.println("Menu 1 is selected !");
		} else if (menu == 2) {
			System.out.println("Menu 2 is selected !");
		} else if (menu == 3) {
			System.out.println("Menu 3 is selected !");
		} else {
			System.out.println("InValid");
		}

	}

}
