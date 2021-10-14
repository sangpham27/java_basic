package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo03_List {

	public static void main(String[] args) {

		List<String> ds = new ArrayList<String>();
		
		ds.add("A");
		ds.add("b");
		ds.add("C");
		ds.add("d");
		ds.set(2, "changed");
		
		System.out.println("Size: " + ds.size());
		for (String a : ds) {
			System.out.println(a);
		}

	}

}
