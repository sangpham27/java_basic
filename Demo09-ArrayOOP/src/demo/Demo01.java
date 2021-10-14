package demo;

import entities.Student;

public class Demo01 {

	public static void main(String[] args) {

		Student[] students = new Student[3];
		Student student1 = new Student("sv01", "Khoi", 20, 9.9);
		students[0] = student1;
		Student student2 = new Student("sv02", "Minh", 19, 9.0);
		students[1] = student2;
		students[2] = new Student("sv03", "Nguyen", 20, 9.5);
		
		System.out.println("Student list 1 =++++++++++");
		for(int i = 0; i< students.length; i++ ) {
			System.out.println("Student "+ i);
//			System.out.println("\tid: " + students[i].getId());
//			System.out.println("\tname: " + students[i].getName());
//			System.out.println("\tage: " + students[i].getAge());
//			System.out.println("\tid: " + students[i].getScore());
			students[i].output();
		}
		
		System.out.println("Student list 2 =++++++++++");
		for(Student student : students) {
//			System.out.println("\tid: " + student.getId());
//			System.out.println("\tname: " + student.getName());
//			System.out.println("\tage: " + student.getAge());
//			System.out.println("\tid: " + student.getScore());
			student.output();
		}
		
	}

}
