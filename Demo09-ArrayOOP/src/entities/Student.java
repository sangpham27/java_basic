package entities;

public class Student {
	private String id;
	private String name;
	private int age;
	private double score;
	
	public void output() {
		System.out.println("\tid: "+ this.getId());
		System.out.println("\tname: "+ this.getName());
		System.out.println("\tage: "+ this.getAge());
		System.out.println("\tscore: "+ this.getScore());
		System.out.println("\t============");
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, int age, double score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
}
