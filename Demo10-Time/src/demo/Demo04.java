package demo;

import java.text.SimpleDateFormat;
import entities.Customer;

public class Demo04 {

	public static void main(String[] args) {
		
		try {
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			Customer[] customers = {
					new Customer("c01", "name 1", simpleDateFormat.parse("20/10/1974"), "male"),
					new Customer("c02", "name 2", simpleDateFormat.parse("17/05/2002"), "female"),
					new Customer("c03", "name 3", simpleDateFormat.parse("26/11/1988"), "female"),
					new Customer("c04", "name 4", simpleDateFormat.parse("05/07/1992"), "male"),
					new Customer("c05", "name 5", simpleDateFormat.parse("25/02/1999"), "male")
			};
			
			for (Customer customer : customers) {
				System.out.println("Is birthday: " + customer.isBirthday());
				System.out.println("Age: " + customer.age());
				System.out.println("==================================");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		/*
		 * Xay dung cac phuong thuc sau trong Class customer.
		 * 1. Khai bao phuong thuc isBirthday kiem tra hom nay co phai la sinh nhat ko?
		 * 2. khai bao phuong thuc age tra ve tuoi cua khach hang
		 */
	
		

	}

}
