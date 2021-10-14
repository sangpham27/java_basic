package demo;

import entities.*;

public class Demo02 {

	public static void main(String[] args) {

		SinhVien sv1 = new SinhVien();

		sv1.masv = "sv1";
		sv1.ten="sinh vien 1";
		sv1.diachi="dia chi 1";
		System.out.println("Thông tin sinh viên 1");
		System.out.println("Mã sv: "+ sv1.masv);
		System.out.println("Họ tên: "+ sv1.ten);
		System.out.println("Địa chỉ: "+ sv1.diachi);
			
		
		SinhVien sv2 = new SinhVien();
		SinhVien sinhVien3 = new SinhVien();
		
		DienThoai dienThoai = new DienThoai();
	}

}
