package demo;

import entities.Employee;
import entities.Teacher;

public class Demo8 {

	public static void main(String[] args) {

		Employee employee = new Employee("e01", "employee 1", "male", 2000);
		System.out.println("Employee info: ");
		System.out.println("Name: " + employee.getName());
		System.out.println("Gender: " + employee.getGender());
		System.out.println("Id: " + employee.getId());
		System.out.println("Salary: " + employee.getSalary());
		
		Teacher teacher = new Teacher("Teacher 1", "male", "t01", 20);
		System.out.println("Teacher info:");
		System.out.println("name: " + teacher.getName());
		System.out.println("gender: " + teacher.getGender());
		System.out.println("Id: " + teacher.getId());
		System.out.println("Salary: " + teacher.getExp());
		
	}

}
