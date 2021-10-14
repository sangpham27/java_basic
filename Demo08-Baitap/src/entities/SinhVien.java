package entities;

import java.util.Scanner;

public class SinhVien {
	private String masv;
	private String hoTen;
	private String gioiTinh;
	private double toan;
	private double ly;
	private double hoa;
	
	
	
	public double diemTrungBinh(SinhVien sv) {
		return (sv.toan*3 + sv.ly*2 + sv.hoa) /6;
	}
	
	public void output() {
		System.out.println("Thong tin sinh vien: ");
		System.out.print("Ma sinh vien: "+ this.masv);
		System.out.print("Ten sinh vien: "+ this.hoTen);
		System.out.println("Gioi tinh: "+ this.gioiTinh);
		System.out.println("Diem cua sinh vien la: ");
		System.out.println("Toan: "+ this.toan + " - Ly: "+ this.ly +" - Hoa: "+ this.hoa);
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.print("Nhap ma sv: ");
		this.masv = scanner.nextLine();
		System.out.print("Nhap ho va ten: ");
		this.hoTen = scanner.nextLine();
		System.out.println("Nhap gioi tinh: ");
		this.gioiTinh = scanner.nextLine();
		System.out.print("Nhap diem mon toan: ");
		this.toan = scanner.nextDouble();
		System.out.print("Nhap diem mon ly: ");
		this.ly = scanner.nextDouble();
		System.out.print("Nhap diem mon hoa: ");
		this.hoa = scanner.nextDouble();
		if(toan < 0 || ly < 0 || hoa < 0 || toan > 10 || ly > 10 || hoa > 10) {
			System.out.println("Diem nhap vao phai lon hon 0 va be hon 10, moi nhap lai: ");
		}
		} while (toan < 0 || ly < 0 || hoa < 0 || toan > 10 || ly > 10 || hoa > 10);
	}
	
	public SinhVien() {
		
	}
	
	public SinhVien(String masv, String hoTen, String gioiTinh, double toan, double ly, double hoa) {
		this.masv = masv;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public double getToan() {
		return toan;
	}
	public void setToan(double toan) {
		this.toan = toan;
	}
	public double getLy() {
		return ly;
	}
	public void setLy(double ly) {
		this.ly = ly;
	}
	public double getHoa() {
		return hoa;
	}
	public void setHoa(double hoa) {
		this.hoa = hoa;
	}
	
	
}
