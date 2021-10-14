package demo;

import java.util.Scanner; 

public class Demo03 {
	
	private static boolean ktSoNguyenTo(int n) {
		int count = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				count += 1;
			}
		}
		return count==2;
//		if(count <= 2) {
//			return true;
//		}else {
//			return false;
//		}
	}
	
	private static void ktSNTTrongMang(int m, int n) {
		for (int i=m; i<=n; i++) {
			boolean check = ktSoNguyenTo(i);
			if (check == true) System.out.print(" "+i+" ");
		}
	}
	
	private static int bai3(int a, int b) {
		int count = 0;
		for (int i=a; i<=b; i++) {
			boolean check = ktSoNguyenTo(i);
			if (check == true) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		/*
		 * 3. Xay dung ham kiem tra 1 so n co phai so nguyen to hay khong.
		 * 4. Xay dung ham liet ke cac so nguyen to trong khoang tu m den n.
		 * 5. Xay dung ham dem co bao nhieu so nguyen to trong khoang tu m den n
		 * va tra la ket qua cac so nguyen to vua dem.
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so x: ");
		int x = scanner.nextInt();
		boolean result = ktSoNguyenTo(x);
		if(result == true) {
			System.out.println(x + " la so nguyen to.");
		}else {
			System.out.println(x + " khong la so nguyen to.");
		}
		
		System.out.println("==========================================");
		System.out.print("Nhap so m: ");
		int m = scanner.nextInt();
		System.out.print("Nhap so n (lon hon m) : ");
		int n = scanner.nextInt();
		System.out.print("Cac so nguyen to trong khoang tu m den n la: ");
		ktSNTTrongMang(m, n);
		System.out.println("");
		
		System.out.println("==========================================");
		System.out.print("Nhap so a: ");
		int a = scanner.nextInt();
		System.out.print("Nhap so b (lon hon a) : ");
		int b = scanner.nextInt();
		int count = bai3(a, b);
		System.out.print("Co "+count+" so nguyen to trong khoang tu m den n ! \nBao gom cac so: ");
		ktSNTTrongMang(a, b);
		
		
	}

}
