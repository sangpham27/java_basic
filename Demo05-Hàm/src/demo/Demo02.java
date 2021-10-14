package demo;

import java.util.Scanner; 

public class Demo02 {
	
	private static double diemTrungBinh(double toan, double ly, double hoa) {
		return (toan*3 + ly*2 + hoa) /6;
	}
	
	private static String loaiHocLuc(double dtb) {
		if (dtb >= 8) {
			return "Gioi";
		} else if (dtb >= 7) {
			return "Kha";
		} else if (dtb >= 5) {
			return "Trung binh";	
		} else {
			return "Ren luyen them";
		}
	}
	
	public static void main(String[] args) {

		/*
		 * 1. XAy dung ham tinh die trung binh cua sinh vien theo cong thuc:
		 * dtb = (toan*3 + ly*2 + hoa)/6
		 * Tra ket qua diem trung binh sau khi ham thuc hien
		 * 2. Xay dung ham kiem tra ve loai cuar sinh vien dua tren diem trung binh cua sinh vien thao cong thuc:
		 * dtb >= 8 gioi
		 * >= 7 < 8 kha
		 * >= 5 < 7  trung binh
		 * nguoc lai , ren luyen them
		 * 3. Xay dung ham kiem tra 1 so n co phai so nguyen to hay khong.
		 * 4. Xay dung ham kiem tra cac so nguyen to trong khoang tu m den n.
		 * 5. Xay dung ham dem co bao nhieu so nguyen to trong khoang tu m den n
		 * va tra la ket qua cac so nguyen to vua dem.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap diem mon toan: ");
		double toan = scanner.nextDouble();
		System.out.print("Nhap diem mon ly: ");
		double ly = scanner.nextDouble();
		System.out.print("Nhap diem mon hoa: ");
		double hoa = scanner.nextDouble();
		
		double result = diemTrungBinh(toan, ly, hoa);
		String xepLoai = loaiHocLuc(result);
		
		System.out.println("1. Diem trung binh la: " + result);
		System.out.println("2. Xep loai hoc luc: " + xepLoai);
		
	}

}
