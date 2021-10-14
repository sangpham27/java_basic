package demo;

import java.util.HashMap;
import java.util.Map;

public class Demo06_Map {

	public static void main(String[] args) {

		Map<String, Object> student = new HashMap<String, Object>();
		student.put("id", "st01");
		student.put("name", "name 1");
		student.put("name", "name 2");
		student.put("age", 20);
		student.put("score", 8.7);
		
		System.out.println("id: " + student.get("id"));
		System.out.println("age: "+ student.get("age"));
		System.out.println("Student info");
		for(String key : student.keySet()) {
			System.out.println(key + ": " + student.get(key));
		}
		
		
	}

}
