package demo;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Nhap vao m,n, kiem tra 2 gia tri do khi nao m <=n*/
		int m,n;
		do {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhap m: ");
				 	m = scanner.nextInt();
				System.out.print("Nhap n: ");
				 	n = scanner.nextInt();
				 if(m>n) {
					 System.out.println("Nhap lai di, m>n roi.");
				 }
		}while(m>n);
		System.out.println("Nhap dung roi.");
	}

}
