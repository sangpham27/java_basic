package demo;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "p01 | name1 | 4.5 | 7";
		String[] results = s1.split("\\|"); // co "\\" phia truoc vi "|" la ki tu dac biet
		for( String i : results) {
			System.out.println(i.trim());
		}
	}

}
