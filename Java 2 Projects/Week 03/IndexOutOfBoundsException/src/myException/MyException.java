package myException;

public class MyException {

	public static void main(String[] args) {
		int[] delta = new int[4];
		
		try {
			delta[4] = 0;		// There is no delta[4]! 
			
		} catch(Exception ex) {
			ex.printStackTrace();
			//System.out.println(ex.toString());
			//System.out.println(ex.getLocalizedMessage());
		}
	}
}
