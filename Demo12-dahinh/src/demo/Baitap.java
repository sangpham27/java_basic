package demo;

import entities.HinhHoc;
import entities.HinhVuong;
import entities.HinhTron;

public class Baitap {

	public static void main(String[] args) {

		HinhHoc[] hinhHocs = new HinhHoc[3];
		hinhHocs[0] = new HinhTron("Tron 1", 0.5);
		hinhHocs[1] = new HinhVuong("vuong01", 0.4);
		hinhHocs[2] = new HinhTron();
		
		for (HinhHoc hinhHoc : hinhHocs) {
			hinhHoc.input();
			hinhHoc.output();
			System.out.println("------------");
		}
		

	}

}
