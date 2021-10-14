package demo;

import entities.Student;

public class Demo3 {

	public static void main(String[] args) {
		try {
			Student student = null;
//			Student student = new Student();
			student.setId("st01");
			student.setName("abc");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Done");
		}
	}

}
