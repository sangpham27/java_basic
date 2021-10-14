package entities;

import java.util.Scanner;

public abstract class HinhHoc {
	private String tenhinh;
	private double lineWeight;
	
	public abstract double ChuVi();
	public abstract double DienTich();
	
	public void output() {
		System.out.println("Ten hinh: " + this.getTenhinh());
		System.out.println("Do day duong bien: " + this.getLineWeight());
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap ten hinh: ");
		this.tenhinh = scanner.nextLine();
		
		do{
		System.out.print("Nhap do day duong bien: ");
		this.lineWeight = scanner.nextDouble();
		} while (this.lineWeight<0);
	}
	
	public HinhHoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HinhHoc(String tenhinh, double lineWeight) {
		this.tenhinh = tenhinh;
		this.lineWeight = lineWeight;
	}
	public String getTenhinh() {
		return tenhinh;
	}
	public void setTenhinh(String tenhinh) {
		this.tenhinh = tenhinh;
	}
	public double getLineWeight() {
		return lineWeight;
	}
	public void setLineWeight(double lineWeight) {
		this.lineWeight = lineWeight;
	}
	
	
}
