package Demo;

import entities.Product;

public class Demo01 {

	public static void main(String[] args) {
		 
		Product product1 = new Product("p01", "name 1", 4.5, 20);
		Product product2 = new Product("p02", "name 2", 10, 3);
		System.out.println("Product 1 info : ");
		System.out.println("\tId: " + product1.getId());
		System.out.println("\tName: "+ product2.getName());
		product1.display();
		
		
	}

}
