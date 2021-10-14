package demo;

import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		/*
		 * Nhap diem toan ly hoa , tinh diem trung binh theo cong thuc (toan*3 + ly *2 +hoa)/6
		 * Thuc hien xep loai: neu
		 * dtb >= 8 gioi
		 * >= 7 < 8 kha
		 * >= 5 < 7  trung binh
		 * nguoc lai , ren luyen them
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap diem mon toan: ");
		double toan = scanner.nextDouble();
		System.out.print("Nhap diem mon ly: ");
		double ly = scanner.nextDouble();
		System.out.print("Nhap diem mon hoa: ");
		double hoa = scanner.nextDouble();
		double dtb = (toan*3 + ly*2 + hoa) /6;
		System.out.println("Diem trung binh: " + dtb);
		
		if (dtb >= 8) {
			System.out.println("Gioi");
		} else if (dtb >= 7) {
			System.out.println("Kha");
		} else if (dtb >= 5) {
			System.out.println("Trung binh");	
		} else {
			System.out.println("Ren luyen them");
		}


	}

}
