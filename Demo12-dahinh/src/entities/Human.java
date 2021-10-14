package entities;

import java.util.Scanner;

public class Human {
	private String name;
	private String gender;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		this.name = scanner.nextLine();
		System.out.print("Nhap gioi tinh: ");
		this.gender = scanner.nextLine();
	}
	
	public void display() {
		System.out.println("name: " + this.name);
		System.out.println("gender: " + this.gender);
	}
	
	public Human(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
