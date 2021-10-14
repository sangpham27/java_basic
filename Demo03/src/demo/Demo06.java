package demo;

import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int demTrung = 0;
		Scanner scanner = new Scanner(System.in);
		int[] a = {4, -2, 8, -6, 11, 20, -7};
		//Dem so duong
		//Nhap vao x, dem co bao nhieu phan tu = x
		for(int i : a) {
			if(i>0) {
				counter += 1;
			}
		}
		System.out.println("So luong so duong trong mang: " + counter);
		System.out.print("Nhap gia tri x: ");
		int x = scanner.nextInt();
		for(int i : a) {
			if(i == x) {
				demTrung += 1;
			}
		}
		
		System.out.println("So luong so trung voi " + x + " trong mang: " + demTrung);
		
	}

}
