package demo01;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {

		/*
		 1. Nhap vao chieu dai va chieu rong cuar hinh chi nhat. tinh dien tich va chu vi
			 dt = a*b;
			 vc = (a+b)*2
		 2.Nhap vao ban kinh hinh tron. tinh dien tich va chu vi
			 dt = PI*r*r
			 cv 2*PI*r
		 3. Nhap vao 3 diem toan ly va hoa, tinh dtb thao cong thuc
			dtb = (toan*3 + ly*2 + hoa) /6
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bai 1 ----------------------------------");
		System.out.print("Nhap chieu dai: ");
		double dai = scanner.nextDouble();
		System.out.print("Nhap chieu rong: ");
		double rong = scanner.nextDouble();
		double dt = dai*rong;
		double cv = (dai+rong)*2;
		System.out.println("Dien tich : " + dt);
		System.out.println("Chu vi : " + cv);
		
		System.out.println("Bai 2 -----------------------------------");
		System.out.print("Nhap ban kinh hinh tron: ");
		double r = scanner.nextDouble();
		double PI = Math.PI;
		double dttron = PI*r*r;
		double cvtron = 2*PI*r;
		System.out.println("Dien tich hinh tron : " + dttron);
		System.out.println("Chu vi hinh tron : " + cvtron);
		
		System.out.println("Bai 3 ------------------------------------");
		System.out.print("Nhap diem mon toan: ");
		double toan = scanner.nextDouble();
		System.out.print("Nhap diem mon ly: ");
		double ly = scanner.nextDouble();
		System.out.print("Nhap diem mon hoa: ");
		double hoa = scanner.nextDouble();
		double dtb = (toan*3 + ly*2 + hoa) /6;
		System.out.println("Diem trung binh: " + dtb);
		
	}

}
