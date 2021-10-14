package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {

	public static void main(String[] args) {
		
		String dob = "22/10/1980";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = simpleDateFormat.parse(dob);
			SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("dob: " + simpleDateFormat2.format(date));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
