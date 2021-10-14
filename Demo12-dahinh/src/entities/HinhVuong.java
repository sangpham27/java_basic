package entities;

import java.util.Scanner;

public class HinhVuong extends HinhHoc {
	
	private int a;
	
	public HinhVuong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhVuong(String tenhinh, double lineWeight) {
		super(tenhinh, lineWeight);
		// TODO Auto-generated constructor stub
	}

	public void output() {
		super.output();
		System.out.println("Do dai canh cua hinh vuong la: " + this.a);
		System.out.println("Chu vi hinh " + this.getTenhinh() + " la: "+ this.ChuVi());
		System.out.println("Dien tich hinh " + this.getTenhinh() + " la: " + this.DienTich());
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhap do dai canh: ");
			this.a = scanner.nextInt();
		} while (a<0);
	}
	

	@Override
	public double ChuVi() {
		return this.a*4;
	}

	@Override
	public double DienTich() {
		return this.a*this.a;
	}



	
	
}
