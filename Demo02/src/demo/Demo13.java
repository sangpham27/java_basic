package demo;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int toan;
		do {
			System.out.println("Nhap diem Toan de: ");
			toan = scanner.nextInt();
			if(toan < 0 || toan > 10) {
				System.out.println("Nhap lai dang hoang dum em.");
			}
		}while(toan < 0 || toan > 10);
			System.out.println("Nhap dung roi hen. Diem toan la: " + toan + ".");
		
	}

}
