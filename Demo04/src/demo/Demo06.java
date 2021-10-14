package demo;

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "hong";
		String name2 = "hong";
		String name3 = "an";
		int results1 = name1.compareTo(name2);
		System.out.println(results1);
		if(results1 == 0) {
			System.out.println("Chuoi 1 = chuoi 2");
		}
		System.out.println("-------------------------------");
		
		int results2 = name3.compareTo(name1);
		System.out.println(results2);
		if(results2 < 0) {
			System.out.println("name3 < name1 hay an < hong");
		}

	}

}
