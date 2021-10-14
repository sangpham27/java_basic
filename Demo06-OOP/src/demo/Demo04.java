package demo;

import java.util.Scanner;

import entities.*;

public class Demo04 {
		
		SinhVien sinhVien = new SinhVien();
		
		private static void sv1() {
			System.out.println("Thông tin sinh viên 1");
		}

		private static void sv2() {
			System.out.println("Thông tin sinh viên 2");
		}


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			SinhVien sv1 = new SinhVien();
			System.out.println("Nhập mã sv1: ");
			sv1.masv = scanner.nextLine();
			System.out.println("Nhập họ tên sv1: ");
			sv1.ten=scanner.nextLine();
			System.out.println("Nhập địa chỉ sv1: ");
			sv1.diachi=scanner.nextLine();
			
			System.out.println("Mã sv: "+ sv1.masv);
			System.out.println("Họ tên: "+ sv1.ten);
			System.out.println("Địa chỉ: "+ sv1.diachi);
			
			System.out.println("\n" + "///////////////////////");
			
			SinhVien sv2 = new SinhVien();
			System.out.println("Nhập mã sv2: ");
			sv1.masv = scanner.nextLine();
			System.out.println("Nhập họ tên sv2: ");
			sv1.ten=scanner.nextLine();
			System.out.println("Nhập địa chỉ sv2: ");
			sv1.diachi=scanner.nextLine();
			
			System.out.println("Mã sv: "+ sv2.masv);
			System.out.println("Họ tên: "+ sv2.ten);
			System.out.println("Địa chỉ: "+ sv2.diachi);
	}

}
