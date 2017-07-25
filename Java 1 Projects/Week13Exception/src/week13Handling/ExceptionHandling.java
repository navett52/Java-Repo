package week13Handling;

public class ExceptionHandling {

	public static void main(String[] args) {
		int[] error = new int [5];
		try {
		System.out.println(error[6]);
		} catch (Exception ex) {
			 System.out.println("Exception caught: " + ex.toString() + " is out of bounds of the array error");
		 }
		 System.out.println("Made it to the end of main()");
	}

}
