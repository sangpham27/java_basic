package demo;

import entities.Student;

public class Demo03 {

	public static void main(String[] args) {

		Student[] students = {
				new Student("st01", "Khoi", 20, 9.9),
				new Student("st02", "Minh", 17, 9.0),
				new Student("st03", "Nguyen", 19, 9.5)
			};
		
		//Dem co bao nhieu sv co tuoi > 18
		int count=0;
		for(Student student : students) {
			if (student.getAge()>18) {
				count++;
			}
		}
		System.out.println("So sv co tuoi lon hon 18 la: " + count);
		System.out.println("\t=========================");
		
	}

}
