package demo;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a1 = "laptop";
		String a2 = "lap";
		String a3 = "Lap";
		boolean results1 = a1.startsWith(a2);
		System.out.println("A1 bat dau bang A2 : "+ results1);		
		boolean results2 = a1.startsWith(a3);
		System.out.println("A1 bat dau bang A3 : "+ results2);
		System.out.println("--------------------------------");
		
		String s1 = "laptop";
		String s2 = "Lap";
		String s3 = "Top";
		String s4 = "To";
		boolean results3 = s1.toLowerCase().startsWith(s2.toLowerCase());
		System.out.println("S1 bat dau bang S2 : "+ results3);		
		boolean results4 = s1.toLowerCase().endsWith(s3.toLowerCase());
		System.out.println("S1 ket thuc bang S3 : "+ results4);
		boolean results5 = s1.toLowerCase().contains(s4.toLowerCase());
		System.out.println("S1 co chua S4 hay khong : "+ results5);
	}

}
