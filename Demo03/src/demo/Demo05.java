package demo;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int sumEven = 0;
		int[] a = {1,2,3,4,5};
		//Tinh tong phan tu trong mang
		//tinh tong phan tu duong trong mang
		for(int i : a) {
			sum +=  i;
			if(i%2 == 0) {
				sumEven = sumEven + i;
			}
		}
		System.out.println("Tong cac so trong mang: " + sum);
		System.out.println("Tong cac so duong trong mang: " + sumEven);
	}
}
