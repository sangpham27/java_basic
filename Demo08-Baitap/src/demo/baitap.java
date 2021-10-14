package demo;

import entities.Diem;

public class baitap {

	public static void main(String[] args) {
		
		Diem diem1 = new Diem(5, 10);
		Diem diem2 = new Diem(1, 2);
		Diem diem3 = new Diem(3, 7);
		double result = diem1.tinhChuViTamGiac(diem2, diem3);
		System.out.println("Ket qua la: " + result);
		
	}

}
