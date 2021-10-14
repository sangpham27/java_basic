package demo;

import entities.Student;

public class Demo02 {

	public static void display(Student[] students) {
		for(Student student : students) {
			student.output();
		}
	}
	
	public static void main(String[] args) {

		Student[] students = {
			new Student("st01", "Khoi", 20, 9.9),
			new Student("st02", "Minh", 20, 9.0),
			new Student("st03", "Nguyen", 19, 9.5)
		};
		System.out.println("Danh sach 1: ");
		for(int i=0; i< students.length; i++) {
			System.out.println("Student thu " + i);
			students[i].output();
		}
		System.out.println("========++++++++++++=========");
		
		System.out.println("Danh sach 2: ");
		display(students);
		

	}

}
