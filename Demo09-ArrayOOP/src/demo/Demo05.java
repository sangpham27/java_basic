package demo;

import entities.Student;

public class Demo05 {

	public static void main(String[] args) {
		Student[] students = {
				new Student("st01", "Khoi", 20, 9.9),
				new Student("st02", "Minh", 17, 9.0),
				new Student("st03", "Nguyen", 19, 9.5)
		};
		
		//Tim thong tin sv co dtb lon nhat va nho nhat
		Student max = students[0];
		Student min = students[0];
		for(int i=1; i< students.length; i++) {
			if(students[i].getScore()>max.getScore()) {
				max = students[i];
			}
			if(students[i].getScore()<min.getScore()) {
				min = students[i];
			}
		}
		System.out.println("Thong tin sv co diem cao nhat la: ");
		max.output();
		System.out.println("Thong tin sv co diem thap nhat la: ");
		min.output();
		
	}

}
