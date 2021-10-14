package demo;

import entities.Employee;
import entities.Teacher;

public class Demo7 {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Employee 1");
		employee.setGender("male");
		employee.setId("e01");
		employee.setSalary(1000);
		System.out.println("Employee info: ");
		System.out.println("Name: " + employee.getName());
		System.out.println("Gender: " + employee.getGender());
		System.out.println("Id: " + employee.getId());
		System.out.println("Salary: " + employee.getSalary());
		
		Teacher teacher = new Teacher();
		teacher.setName("Teacher 1");
		teacher.setGender("female");
		System.out.println("Teacher info:");
		System.out.println("name: " + teacher.getName());
		System.out.println("gender: " + teacher.getGender());
		
		
	}

}
