package demo;

import entities.Student;
import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {

		Student[] students = {
				new Student("st01", "Khoi", 20, 9.9),
				new Student("st02", "Minh", 17, 9.0),
				new Student("st03", "Nguyen", 19, 9.5)
		};
		
		//Liet ke thong tin sinh vien co ten chua keyword vua nhap
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap keyword: ");
		String keyword = scanner.nextLine();
		System.out.println("Ket qua tim kiem: \n========================");
		for(Student student : students) {
			if(student.getName().toLowerCase().contains(keyword.toLowerCase())) {
				student.output();
			}
		}
		

	}

}
