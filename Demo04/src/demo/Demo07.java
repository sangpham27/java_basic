package demo;

public class Demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "acc01";
		boolean results = username.isEmpty();
		System.out.println(results);
		
		boolean results2 = username.equals("ACC01");
		System.out.println(results2);
		
		boolean results3 = username.equalsIgnoreCase("ACC01");
		System.out.println(results3);
	}

}
