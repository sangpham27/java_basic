package demo;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		/* 
		 Bai 1 --Nhap vao so nguyen x, kiem tra x co phai so chan va > 10 hay khong
		 Bai 2 --Nhap vao so nguyen x va a,b , kiem tra x co nam trong khoang ab hay khong
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bai 1 ----------------------------------");
		System.out.println("Nhap x: ");
		int x = scanner.nextInt();
		int s = x%2 ;
		if (s==0 && x>10) { 
			System.out.println(x + " la so chan vaf lon hon 10 !");
		} else {
			System.out.println("INvalid");
		}
		
		System.out.println("Bai 2 ----------------------------------");
		System.out.println("Nhap y:");
		int y = scanner.nextInt();
		System.out.println("Nhap a:");
		int a = scanner.nextInt();
		System.out.println("Nhap b (Lon hon a):");
		int b = scanner.nextInt();
		if (y > a && y < b) {
			System.out.println("y nam trong khoang "+ a + "-" +b);
		} else {
			System.out.println("y KHONG nam trong khoang "+a+"-"+b );
		}
		
	}

}
