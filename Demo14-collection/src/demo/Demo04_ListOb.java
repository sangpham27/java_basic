package demo;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Demo04_ListOb {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product("sp01", "name 1", 10.5));
		products.add(new Product("sp2", "name2", 1.5));
		
		for (Product product : products) {
			product.output();
			System.out.println("========");
		}
		

	}

}
