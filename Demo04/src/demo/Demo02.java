package demo;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname = "Khoi Nguyen";
		System.out.println(fullname.length());
		char ch = fullname.charAt(3);
		System.out.println(ch);
		System.out.println("---------------------------");
		for(int i = 0; i < fullname.length(); i++) {
			System.out.println(fullname.charAt(i));
		}
		System.out.println("---------------------------");
		// bao nhieu ki tu la nguyen am ( u e o a i )
		int counter = 0;
		for(int i=0; i <fullname.length();i++) {
			char check = fullname.charAt(i);
			if (check == 'u' || check == 'e' || check == 'o' || check == 'a' || check == 'i') {
				counter++;
			}
		}
		System.out.println("So nguyen am la: " + counter);
	}

}
