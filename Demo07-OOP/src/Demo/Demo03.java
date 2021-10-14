package Demo;

import entities.Product;

public class Demo03 {

	private static double total(Product product) {
		return product.getPrice() * product.getQuantity();
	}

	public static void main(String[] args) {

		Product product1 = new Product();

		product1.input();
		System.out.println("Total 1: " +total(product1));

		Product product2 = new Product();

		product2.input();
		System.out.println("Total 2: " +total(product2));

	}

}


