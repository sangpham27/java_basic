package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo02_collection {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>(); //Vung nho cua mang tu co gian
		a.add(12);
		a.add(5);
		a.add(15);
		a.add(-9);
		System.out.println("size: " + a.size());
		System.out.println(a.get(1));
		for(int i=0; i< a.size(); i++) {
			System.out.println("   " + a.get(i));
		}
		
		System.out.println("==========");
		for(int i : a) {
			System.out.println("    " + i);
		}
		
		System.out.println("==========");
		a.remove(1);
		System.out.println("size: " + a.size());
		
		System.out.println("==========");
		a.clear();
		if(a.isEmpty()) {
			System.out.println("Mang rong !");
		} else {
			System.out.println("Mang khong rong!");
		}
	}

}
