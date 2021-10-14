package demo;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[3];
		names[0] = "5";
		names[1] = "Long";
		names[2] = "a";
		for(int i = 0; i < names.length ; i++) {
			System.out.println(" " + names[i]);
		};
		
		for(String name: names) {
			System.out.println("" + name);
		}
	}

}
