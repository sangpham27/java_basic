package Demo;

import entities.PhanSo;

public class Demo04 {

	public static void main(String[] args) {
		/* 
		 * Xay dung class PhanSo co 2 tham so tu va mau kieu so nguyen 
		 * a) khai bao 2 constructor 
		 * khai bao cac ham get set
		 * c) khai bao ham input nhap thong tin cho tu va mau .
		 * Luu y neu trogn qua trinh nhap neu nguoi su dung nhap mau la 0 thi bat nhap lai cho den khi 
		 * mau khac 0
		 * d) Khai bao ham output hien thi thong tin cua phan so theo dang tu/mau.
		 * e) Khao bao phuong thuc tinh tong 2 phan so va in ket qua. Cach tinh tong 2 phan so nhu sau:
		 * a/b + c/d = a*d + b*c/b*d
		 * f) Thuc hien tinh tong 3 phan so
		 * */
		
//		PhanSo phanSo = new PhanSo();
//		phanSo.input();
//		phanSo.output();
		
		System.out.println("==========================");
		System.out.println("Cong 2 phan so: ");
//		System.out.print("Nhap phan so thu 1 ==> ");
//		PhanSo ps1 = new PhanSo();
//		ps1.input();
//		System.out.print("Nhap phan so thu 2 ==> ");
//		PhanSo ps2 = new PhanSo();
//		ps2.input();
		
		PhanSo ps1 = new PhanSo(7,10);
		PhanSo ps2 = new PhanSo(4,6);
		PhanSo ps3 = new PhanSo(1,5);
		
		ps1.tongVoiphanSo(ps2).tongVoiphanSo(ps3).output(); // e)
		
		System.out.println("==========================");
		System.out.println("Cong 3 phan so: ");

	}

}
