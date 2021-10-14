package demo;

public class Demo1 {

	public static void main(String[] args) {

		try {
			int a=10, b=0;
			int result = a/b;
			System.out.println("result: " + result);
			
		} catch (Exception e) {
			System.out.println("Loi me roi");
			System.out.println(e.getMessage());
			e.printStackTrace(); // thong tin noi sinh ra loi
		}
		System.out.println("Done");
		
	}

}
