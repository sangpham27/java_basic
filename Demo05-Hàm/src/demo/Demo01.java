package demo;

import java.util.Scanner; 

public class Demo01 {
	
	private static void hello() {
		System.out.println("Hello world");
	}
	
	private static void hi(String fullname) {
		System.out.println("Hi " + fullname);
	}
	
	private static void sum(double a, double b) {
		double c = a + b;
		System.out.println("Tong hai so vua nhap la: " + c);
	}
	
	private static double sub(double a, double b) {
		return a + b;
	}
	
	/*
	 Xay dung ham login cos 2 tham so username va password kieur chuoi 
	 kiem tra neu username la abc pass la def thi tra
	 ket qua ve cho ham la true. ngươc lai, tra ket qua là false.
	 */
	private static boolean login(String user, String pass) {
		return user.equals("abc") && pass.equals("def");
	}
	
	public static void main(String[] args) {
		
		hello();
		hello();
		hi("Khoi dep trai");
		sum(3,5);
		double result = sub(5, 10);
		System.out.println("Ket qua tra ve la: " + result);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap user name: ");
		String usern = scanner.next();
		System.out.print("Nhap password: ");
		String pass = scanner.next();
		
		boolean stt = login(usern, pass);
		if (stt == true) {
			System.out.println("Dang nhap thanh cong !");
		} else {
			System.out.println("Dang nhap that bai !");
		}
		
		
		
	}

}
