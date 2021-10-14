package demo;

public class Demo6 {
	
	private static int div(int a, int b) throws Exception { //throws rang buoc bat phai dat ham trong try_catch
		return a/b;	
	}
	
	public static void main(String[] args) {

		try {
			int result = div(10, 5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Done");
		
	}

}
