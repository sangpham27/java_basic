package demo;

import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nhap 1 so nguyen duong
		//Dem co bao nhieu uoc so
		//Kiem tra n co phai so nguyen to ko
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so n: ");
		int n = scanner.nextInt();
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println("Uoc so cua " + n +" : "+ i);
				count += 1;
			}
		}
		if(count <= 2) {
			System.out.println(n + " la so nguyen to.");
		}else {
			System.out.println(n + " khong la so nguyen to.");
		}
	}

}
