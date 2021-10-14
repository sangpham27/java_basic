package demo01;

import java.util.Scanner; //import package de dung scanner

public class Demo6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("age: ");
		int age = scanner.nextInt();
		System.out.println("TUoi vua nhap la: " + age);
		
//		System.out.print("price: ");
//		double price = scanner.nextDouble();
//		System.out.println("Gia vua nhap la: "+price);
//
//		System.out.print("Status: ");
//		boolean status = scanner.nextBoolean();
//		System.out.println("Status vua nhap la: "+status);
		
		//Bi truot qua vi trong buffer con /n sau khi nhap so
		scanner.nextLine(); // clear buffer
		System.out.print("Full name: ");
		String fullname = scanner.nextLine();
		System.out.println("Fullname vua nhap la: "+fullname);
		
		double a = Math.PI ; // Class math
	}

}
