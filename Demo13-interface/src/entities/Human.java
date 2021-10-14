package entities;

public class Human implements IHuman,IHuman2,IHuman3 {
	private String name;
	private String gender;
	
	public Human(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public void eat() {
		System.out.println("Human eat");
		
	}
	@Override
	public void sleep() {
		System.out.println("Human sleep");
		
	}
	@Override
	public void run() {
		System.out.println("Human run");
		
	}
	@Override
	public void action3() {
		System.out.println("Action 3");
		
	}
	@Override
	public void action4() {
		System.out.println("Action 4");
		
	}
	@Override
	public void action5() {
		System.out.println("Action 5");
		
	}
	@Override
	public void action6() {
		System.out.println("Action 6");
		
	}
	@Override
	public void action1() {
		System.out.println("Action 1");
		
	}
	@Override
	public void action2() {
		System.out.println("Action 2");
		
	}
	
	
	
}
