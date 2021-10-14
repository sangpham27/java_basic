package demo;

import java.util.Scanner;

import entities.Course;
import entities.Faculty;
import entities.Student;

public class Demo03 {

	public static void main(String[] args) {

		Student student = new Student();
//		student.setId("st01");
//		student.setName("name 1");
//		student.setFaculty(new Faculty("it", "CNTT"));
//		Course[] courses = new Course[3];
//		courses[0] = new Course("c1", "Course 1");
//		courses[1] = new Course("c2", "Course 2");
//		courses[2] = new Course("c3", "Course 3");
//		student.setCourse(courses);
		
		student.input();
		System.out.println("=============-------------=============");
		student.output();



	}

}
