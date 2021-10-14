package demo;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5, 1, 6, 4, 8, 3, 7};
		for ( int i =0; i< a.length -1; i++) {
			for (int y= i+1; y< a.length; y++) {
				if (a[i]<a[y]) {
					int ps = a[i];
					a[i] = a[y];
					a[y] = ps;
				}
			}
		}
		System.out.println("Mang sau khi sap xep giam dan:");
		for(int i : a) {
			System.out.print(" "+i);
		}
	}

}
