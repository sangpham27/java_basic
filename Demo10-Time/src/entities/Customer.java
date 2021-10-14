package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Customer {
	
	private String id;
	private String name;
	private Date dob;
	private String gender;
	
	public int age() {
		Date now = new Date();
		
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		calendar1.setTime(dob);
		calendar2.setTime(now);
		
		return calendar2.get(calendar2.YEAR) - calendar1.get(calendar1.YEAR);
	}
	
	public boolean isBirthday() {
			Date now = new Date();
			
			Calendar calendar1 = Calendar.getInstance();
			Calendar calendar2 = Calendar.getInstance();
			
			calendar1.setTime(dob);
			calendar2.setTime(now);
			
			return calendar1.get(calendar1.MONTH) == calendar2.get(calendar2.MONTH)
					&& calendar1.get(calendar1.DAY_OF_MONTH) == calendar2.get(calendar2.DAY_OF_MONTH);
			
//			if (calendar1.get(calendar1.MONTH) == calendar2.get(calendar2.MONTH)
//				&& calendar1.get(calendar1.DAY_OF_MONTH) == calendar2.get(calendar2.DAY_OF_MONTH)) {
//				return true;
//			} else {
//				return false;
//			}
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String id, String name, Date dob, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
