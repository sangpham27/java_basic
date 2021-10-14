package entities;

import java.util.Scanner;

public class Student {
	
	private String id;
	private String name;
	private Faculty faculty;
	private Course[] courses;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap id sinh vien: ");
		this.id = scanner.nextLine();
		System.out.print("Nhap name sinh vien: ");
		this.name = scanner.nextLine();
		
		Faculty a = new Faculty();
		a.input();
		this.setFaculty(a);
	
		System.out.print("Nhap so mon hoc: ");
		int n = scanner.nextInt();
		Course[] b = new Course[n];
		for (int i=0; i<n; i++) {
			b[i] = new Course();
			System.out.println("\tMon thu " + (i+1) + ":");
			b[i].input();
		}
		this.setCourses(b);

	}
	
	public void output() {
		System.out.println("Thong tin sinh vien:");
		System.out.println("id: " + this.getId());
		System.out.println("name: " + this.getName());
		
		this.faculty.output();
		
		System.out.println("Cac mon hoc: ");
		for (Course course : this.courses ) {
			course.output();
			System.out.println("\t-----");
		}
		System.out.println("==========================");
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
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public Course[] getCourse() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	public Student(String id, String name, Faculty faculty, Course[] course) {
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.courses = course;
	}
	public Student() {
	}
	
	
	
	
	
}
