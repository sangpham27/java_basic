package demo;

import entities.SinhVien;

public class Demo05 {

	public static void main(String[] args) {

		SinhVien sinhVien = new SinhVien();
		sinhVien.nhap();
		System.out.println(sinhVien.xeploai(sinhVien.tinhDTB()));

	}

}
