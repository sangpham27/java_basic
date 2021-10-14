package demo;

public class Demo01_wrapperClass {

	public static void main(String[] args) {

		//int a = 123;
		// Integer // wrapper Class
		
		//double b = 4.5;
		// Double // wrapper Class
		
		String s1 = "123";
		String s2 = "4.5";
		String s3 = "true";
		
		int a = Integer.parseInt(s1);
		double b = Double.parseDouble(s2);
		boolean c = Boolean.parseBoolean(s3);
		
		String result1 = String.valueOf(a);
		System.out.println(result1);
		
	}

}
