package demo;

import java.util.HashSet;
import java.util.Set;

public class Demo05_Set {

	public static void main(String[] args) {

		Set<Integer> a = new HashSet<Integer>();
		a.add(5);
		a.add(-2);
		a.add(11);
		a.add(7);
		for(int i:a) {
			System.out.println("\t" + i); //Khong theo thu tu, tu dong xep tu be den lon
		}

	}

}
