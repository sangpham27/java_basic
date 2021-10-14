package entities;

import java.util.Scanner;

public class Course {

	private String id;
	private String name;
	
	public void output() {
		System.out.println("\t"+this.getId());
		System.out.println("\t"+this.getName());
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\t\tNhap id mon hoc: ");
		this.id = scanner.nextLine();
		System.out.print("\t\tNhap ten mon hoc: ");
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
	public Course(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public Course() {
	}
	
	
	
}
