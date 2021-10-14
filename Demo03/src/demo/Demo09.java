package demo;

//import java.util.Scanner;

public class Demo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int demSoNguyenTo = 0;
//		Scanner scanner = new Scanner(System.in);
		int[] a = {4, 2, 3, 6, 11, 20, 7};
		//
		System.out.print("Cac so nguyen to gom : ");
		for(int i = 0; i< a.length; i++) {
			int counter = 0;
			for(int y = 1; y<=a[i]; y++) {
				if( a[i]%y==0) {counter += 1;};
			}
			if(counter <= 2) {
				System.out.print(a[i]+" ");
				demSoNguyenTo += 1;
			}
		}
		System.out.println("");
		System.out.println("Co "+ demSoNguyenTo + " so nguyen to trong mang !");
		
		

		
	}

}
