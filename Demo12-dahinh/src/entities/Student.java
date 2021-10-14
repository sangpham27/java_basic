package entities;

import java.util.Scanner;

public class Student extends Human{
	
	private String id;
	private double score;
	
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ma sinh vien: ");
		this.id = scanner.nextLine();
		System.out.print("Nhap diem: ");
		this.score = scanner.nextDouble();
	}
	
	public void display() {
		super.display();
		System.out.println("id : "+ this.id);
		System.out.println("score : "+ this.score);
	}
	
	public Student(String name, String gender, String id, double score) {
		super(name, gender);
		this.id = id;
		this.score = score;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	

}
