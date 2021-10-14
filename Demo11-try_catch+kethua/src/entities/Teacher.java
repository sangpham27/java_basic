package entities;

public class Teacher extends Human {

	private String id;
	private int exp;
	
	public Teacher(String name, String gender, String id, int exp) {
		super(name, gender);
		this.id = id;
		this.exp = exp;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, String gender) {
		super(name, gender);
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
}
