package demo01;

public class Demo4 {

	public static void main(String[] args) {
		int a=10, b=5;
		
		//and
		boolean result1 = a>3 && b>2;
		System.out.println("result1: " +result1);
		
		//or
		boolean result2 = a>3 || b>6;
		System.out.println("result2: " +result2);
		
		//not
		boolean result3 = !result2;
		System.out.println("result3: " +result3);
	}

}
