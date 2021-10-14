package entities;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;
	
	public double tinhChuViTamGiac(Diem diemB, Diem diemC) {
		return (this.tinhDoDai(diemB) + this.tinhDoDai(diemC) + diemB.tinhDoDai(diemC));
	}
	
	public double tinhDoDai(Diem diem) {
		return Math.sqrt((diem.x-this.x)*(diem.x-this.x)+(diem.y-this.y)*(diem.y-this.y));
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap x: ");
		this.x = scanner.nextInt();
		System.out.print("Nhap y: ");
		this.y = scanner.nextInt();
		while (this.x > 2000 || this.y > 2000 || this.x < -2000 || this.y < -2000){
			System.out.println("Gia tri x,y phai trong khoang -2000 den 2000, moi nhap lai:");
			System.out.print("Nhap x: ");
			this.x = scanner.nextInt();
			System.out.print("Nhap y: ");
			this.y = scanner.nextInt();
		}
		
	}
	
	public void output() {
		System.out.println("Gia tri cua x la: " + this.x);
		System.out.println("Gia tri cua y la: " + this.y);
	}
	
	public Diem() {
	}
	
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
