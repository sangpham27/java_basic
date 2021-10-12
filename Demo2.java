package demo01;

public class Demo2 {

	public static void main(String[] args) {
		int a=10, b=3;
		int result1 = a+b;
		System.out.println(result1);
		int result2 = a-b;
		System.out.println(result2);
		int result3 = a*b;
		System.out.println(result3);
		double result4 = (double)a / b; //ep kieu
		System.out.println(result4);
		int result5 = a%b;
		System.out.println(result5);
		a++;
		System.out.println("a :" + a);
		b--;
		System.out.println("b :" + b);
	}

}
