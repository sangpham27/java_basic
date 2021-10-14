package entities;

public class SinhVien {
//	Khai bao thuoc tinh
	
	private String id;   /* Private : chi Class nay duoc su dung */
	protected String name;  /* Protected : khac Class nhung chung package goi duong*/
	public String diachi;  /* Public : khac class khac package deu dung duoc*/
	public String masv;
	public String ten;
//	Khai bao phuong thuc
	public void nhap() {
		System.out.println("Nhap thong tin sinh vien: ");
	}
	
	public double tinhDTB() {
		double dtb = 8.0;
		return dtb;
	}
	
	public String xeploai(double dtb) {
		return "Gioi";
	}
	
	
	
}
