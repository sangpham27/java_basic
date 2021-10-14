package demo;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] names = new String[3];
		for(int i = 0; i < names.length; i++) {
			System.out.println(" Name " + i + ": ");
			names[i] = scanner.nextLine();
		}
		
		System.out.println("List of names: ");
		for(String name : names) {
			System.out.println(name);
		}
		

	}

}
