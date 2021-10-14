package demo;

import entities.HinhChuNhat;
import entities.HinhTron;
import entities.HinhVuong;
import entities.IHinhHoc;

public class Demo02 {

	public static void main(String[] args) {
		
		IHinhHoc[] iHinhHocs = new IHinhHoc[6];
		iHinhHocs[0] = new HinhVuong("HV01", 5.6);
		iHinhHocs[1] = new HinhChuNhat("HCN01", 10, 4);
		iHinhHocs[2] = new HinhTron("HT01", 16);
		iHinhHocs[3] = new HinhVuong("HV02", 11);
		iHinhHocs[4] = new HinhChuNhat("HCN02", 8, 3);
		iHinhHocs[5] = new HinhTron("HT02", 9);
		
		for (IHinhHoc iHinhHoc : iHinhHocs) {
			System.out.println("Dien tich: " + iHinhHoc.dienTich());
			System.out.println("Chu vi: " + iHinhHoc.chuVi());
			iHinhHoc.print();
			System.out.println("========================");
		}
		
		
	}

}
