package demo;

import entities.Product;
import java.util.Scanner;

public class Demo06 {
	
	public static void menu1(Product[] prs) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap min: ");
		int min = scanner.nextInt();
		System.out.print("Nhap max: ");
		int max = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nhap danh muc: ");
		String dm = scanner.nextLine();
		
		System.out.println("Ket qua: ");
		for(Product pr : prs) {
			if(pr.getCategory().toLowerCase().contains(dm.toLowerCase())) {
				if(pr.getPrice()>min && pr.getPrice()<max) {
					pr.output();
				}
			}
		}
	}
	
	public static void menu2(Product[] prs) {
		double result=0;
		for(Product product : prs) {
			result+=product.total();
		}
	}
	
	public static void main(String[] args) {

		Product[] products = {
				new Product("p01", "nokia1", 10, 2, "nokia"),
				new Product("p02", "nokia2", 2, 7, "nokia"),
				new Product("p03", "samsung1", 15, 4, "samsung"),
				new Product("p04", "samsung2", 12, 5, "samsung"),
				new Product("p05", "apple1", 26, 8, "apple")
		};
		/*
		 * Xay dung menu thuc hien cac yeu cau sau:
		 * 1/ Liet ke cac san pham co gia nam trong 1 khoang tu min den max va thuoc 1 danh muc
		 * 2/ Tinh tong tien tat ca cac san pham
		 * 3/ tinh tong tien cac san pham thuoc 1 danh muc
		 * 4/ Dem cac san pham co tong tien nam trong 1 khoang tu min den max
		 * 5/ Kiem tra 1 san pham co ton tai trong mang hay khong
		 * 6/ Dem co bao nhieu san pham co gia bang gia san pham lon nhat
		 */
		System.out.println("1/ Liet ke cac san pham co gia nam trong 1 khoang tu min den max va thuoc 1 danh muc");
		System.out.println("2/ Tinh tong tien tat cac san pham");
		System.out.println("3/ tinh tong tien cac san pham thuoc 1 danh muc");
		System.out.println("4/ Dem cac san pham co tong tien nam trong 1 khoang tu min den max");
		System.out.println("5/ Kiem tra 1 san pham co ton tai trong mang hay khong");
		System.out.println("6/ Dem co bao nhieu san pham co gia bang gia san pham lon nhat");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap yeu cau cua ban: ");
		int request = scanner.nextInt();
		if(request == 1) {
			menu1(products);
		} else if (request == 2) {
//			menu2(products);
		} else if (request == 3) {
//			menu3(products);
		} else if (request == 4) {
//			menu4(products);
		} else if (request == 5) {
//			menu5(products);
		} else if (request == 6) {
//			menu6(products);
		} else {
			System.out.println("Invalid!");
		}
	}

}
