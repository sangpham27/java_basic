package demo;

import entities.DienThoai;

public class Demo03 {

	public static void main(String[] args) {

		DienThoai dienThoai1 = new DienThoai();
		dienThoai1.setMadt("dt01");
		dienThoai1.setGia(4.5);
		dienThoai1.setSoluong(10);
		dienThoai1.setTen("dien thoai 1");
		System.out.println("Thong tin dien thoai 1:");
		System.out.println("ma dien thoai: " + dienThoai1.getMadt());
		System.out.println("ten dien thoai: " + dienThoai1.getTen());
		System.out.println("so luong dien thoai: " + dienThoai1.getSoluong());
		System.out.println("gia dien thoai: " + dienThoai1.getGia());
		
		double tongtien = dienThoai1.getGia() * dienThoai1.getSoluong();
		System.out.println("tong tien: " + tongtien);
		
		DienThoai dienThoai2 = new DienThoai();
		
	}

}
