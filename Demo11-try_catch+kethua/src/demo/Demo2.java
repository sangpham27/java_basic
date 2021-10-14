package demo;

public class Demo2 {

	public static void main(String[] args) {

		try {
			
			int[] a = new int[3];
			a[5] = 10;
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Vuot qua kich thuoc mang");
		} catch (NullPointerException e) {
			System.out.println("Doi tuong su dung khong duoc rong");
		} catch (ArithmeticException e) {
			System.out.println("Khong chia duoc cho 0");
		}
		System.out.println("Done");

	}

}
