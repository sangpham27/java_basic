package demo;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Nhap 2 so m & n
		 liet ke tu m den n
		 liet ke so chan trong m&n
		 tinh tong tu m den n
		 dem co bao nhieu so le giua m va n
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap m: ");
		int m = scanner.nextInt();
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();
		System.out.println("So tu m den n: ");
		for(int i = m; i<=n; i++) {
			System.out.println(i);
		}
		System.out.println("So chan tu m den n: ");
		for(int i = m; i<=n; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Tong cac so tu m den n: ");
		int sum = 0;
		for(int i = m; i<=n; i++) {
			sum = sum + i;
			//sum+ = i
		}
		System.out.println(sum);
		int num = 0;
		System.out.println("Tong so le tu m den n: ");
		for(int i = m; i<=n; i++) {
			if(i%2 != 0) {
				num = num + 1;
			}
		}
		System.out.println(num);
		
	}

}
