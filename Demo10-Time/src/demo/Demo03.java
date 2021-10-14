package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Demo03 {

	public static void main(String[] args) {

		/*
		 * Nhap vao 1 ngay sinh theo dinh dang dd/mm/yyyy. Thuc hien cac yeu cau sau:
		 * 1. Kiem tra tuoi cua ngay sinh cua nhap co du 18 tuoi hay chua
		 * 2. Kiem tra hom nay co phai la sinh nhat hay khong
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ngay sinh theo dang dd/mm/yyyy: ");
		String input = scanner.next();
		
		try {
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date birthDate = simpleDateFormat.parse(input);
			
			Date date = new Date();
			
			Calendar calendar = Calendar.getInstance();
			
			calendar.setTime(birthDate);
			int birthYear = calendar.get(calendar.YEAR);
			int birthMonth= calendar.get(calendar.MONTH);
			int birthDay  = calendar.get(calendar.DAY_OF_MONTH);
			
			calendar.setTime(date);
			int nowYear = calendar.get(calendar.YEAR);
			int nowMonth= calendar.get(calendar.MONTH);
			int nowDay  = calendar.get(calendar.DAY_OF_MONTH);
			
			int check = calendar.YEAR; // unwork
			System.out.println("CHECKKKKK  : " + check+ " || and : " + nowYear);
			
			int age = nowYear-birthYear;
			System.out.println("Tuoi cua ban: " + age);
			if (age>18) {
				System.out.println("Tren 18 tuoi !");
			} else {
				System.out.println("Chua su 18 tuoi");
			}
			
			if (birthMonth == nowMonth && birthDay == nowDay) {
				System.out.println("Hom nay la sinh nhat cua ban !");
			} else {
				System.out.println("Hom nay khong phai sinh nhat cua ban !");
			}
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}

}
