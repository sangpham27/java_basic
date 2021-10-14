package entities;

import java.util.Scanner;

public class Faculty {

	private String id;
	private String name;
	
	public void output() {
		System.out.println("Ma khoa: " + this.getId() + " - Ten khoa: " + this.getName());
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap id khoa: ");
		this.id = scanner.nextLine();
		System.out.print("Nhap ten khoa: ");
		this.name = scanner.nextLine();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Faculty(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public Faculty() {
	}
	
	
	
}
