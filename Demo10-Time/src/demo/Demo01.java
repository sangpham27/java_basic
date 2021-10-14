package demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo01 {

	public static void main(String[] args) {

		Date today = new Date();
		System.out.println("Today: " + today);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Today: " + simpleDateFormat.format(today));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int year = calendar.get(calendar.YEAR);
		System.out.println("year: " + year);
		int month = calendar.get(calendar.MONTH) + 1; // do bat dau tu 0
		System.out.println("month: " + month);
		int day = calendar.get(calendar.DAY_OF_MONTH);
		System.out.println("day: " + day);

	}

}
