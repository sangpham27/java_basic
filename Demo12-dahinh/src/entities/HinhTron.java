package entities;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
	
	private int r;
	
	public HinhTron() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HinhTron(String tenhinh, double lineWeight) {
		super(tenhinh, lineWeight);
		// TODO Auto-generated constructor stub
	}

	public void output() {
		super.output();
		System.out.println("Ban kinh cua hinh tron la: " + this.r);
		System.out.println("Chu vi hinh " + this.getTenhinh() + " la: "+ this.ChuVi());
		System.out.println("Dien tich hinh " + this.getTenhinh() + " la: " + this.DienTich());
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhap ban kinh hinh tron: ");
			this.r = scanner.nextInt();
		} while (r<0);
	}
	
	@Override
	public double ChuVi() {
		return Math.PI*2*this.r;
	}

	@Override
	public double DienTich() {
		return Math.PI*this.r*this.r;
	}

}
