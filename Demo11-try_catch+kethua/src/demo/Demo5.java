package demo;

public class Demo5 {

	public static void main(String[] args) {

		try {
			try {
				int a=10, b=0;
				int result = a/b;
				System.out.println("result: " + result);
			} catch (Exception e) {
				System.out.println("Exception 2");
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Exception 1");
		}
		System.out.println("Done");

	}

}
