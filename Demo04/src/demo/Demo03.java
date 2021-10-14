package demo;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname = "       Nguyen Van A";
		System.out.println(fullname.length());
		fullname = fullname.trim();
		System.out.println(fullname.length());
		System.out.println("---------------------------");
		
		String results1 = fullname.toUpperCase();
		System.out.println(results1);
		String results2 = fullname.toLowerCase();
		System.out.println(results2);
	}

}
