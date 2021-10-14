package entities;

import java.util.Scanner;

public class PhanSo {
	private int tu;
	private int mau;
	
	public PhanSo() {
		
	}
	
	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap tu: ");
		this.tu = scanner.nextInt();
		System.out.print("Nhap mau: ");
		this.mau = scanner.nextInt();
		while (this.mau == 0) {
			System.out.print("Nhap mau: ");
			this.mau = scanner.nextInt();
		}
		
	}
	
	public void output() {
		System.out.print("Phan so la: ");
		System.out.println(this.tu + "/" +this.mau);
	}
	
	public PhanSo tongVoiphanSo(PhanSo ps) {
//		int a = this.tu * ps.mau + this.mau * ps.tu; // a*d + b*c
//		int b = this.mau * ps.mau;						// b*d
//		System.out.println("Ket qua tong 2 phan so la : "+ a +"/"+ b );
//		PhanSo result = new PhanSo(a, b);
//		return result;
		return new PhanSo(this.tu*ps.mau+this.mau*ps.tu, this.mau*ps.mau);
	}
	
	public void tong2() {
		
	}
	
	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) {
		this.mau = mau;
	}
	
	
}
