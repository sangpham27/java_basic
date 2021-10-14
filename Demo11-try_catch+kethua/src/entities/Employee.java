package entities;

public class Employee extends Human {
	
	private String id;
	private double salary;
	
	
	public Employee(String id, String name, String gender, double salary) {
		super(name, gender);
		this.id = id;
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
