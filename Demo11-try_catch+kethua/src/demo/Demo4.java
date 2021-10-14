package demo;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
		double a=0;
		Boolean flag;
		do {
			Scanner scanner = new Scanner(System.in);
			flag = true;
			try {
				System.out.println("Nhập vào 1 điểm bất kì: ");
				a = scanner.nextDouble();
			} catch (Exception e) {
				flag = false;
				System.out.println("Số vừa nhập phải là số hợp lệ");
			}
		} while ( a<0 || a>10 || !flag);
			System.out.println("Điểm vừa nhập là: " +a);
		

	}

}
