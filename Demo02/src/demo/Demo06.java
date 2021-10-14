package demo;

import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		/*
		 * Nhap 2 so nguyen a va b, dung 1 menu thuc hien cac yeu cau cong, tru, nhan, chia
		 * 
		 * */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print ("Nhap a: ");
		int a = scanner.nextInt();
		System.out.print ("Nhap b: ");
		int b = scanner.nextInt();

		System.out.println("1. Phep cong");
		System.out.println("2. Phep tru");		
		System.out.println("3. Phep nhan");	
		System.out.println("4. Phep chia");	
		System.out.print("Select: ");
		int menu = scanner.nextInt();
		if (menu == 1) {
			int sum = a+b;
			System.out.println("Tong hai so a va b: "+ sum);
		} else if (menu == 2) {
			int tru = a-b;
			System.out.println("Hieu hai so a va b: "+ tru);
		} else if (menu == 3) {
			int tich = a*b;
			System.out.println("Nhan hai so a va b: "+ tich);
		} else if (menu == 4) {
			double thuong = (double)a/b;
			System.out.println("Thuong hai so a va b: "+ thuong);			
		} else {
			System.out.println("InValid");
		}

	}

}
