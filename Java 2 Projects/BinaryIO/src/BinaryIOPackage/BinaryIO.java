/***************************************************
 * Binary I/O Examples in Java                     *
 * Bill Nicholson                                  *
 * nicholdw@ucmail.uc.edu                          *
 ***************************************************/
package BinaryIOPackage;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BinaryIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryIO b = new BinaryIO();
		//b.WriteBinary();

		b.FloatingPointError();
	}
	public void WriteBinary()
	{
//		Adapted from http://www.roseindia.net/tutorial/java/core/files/javafilebinary.html		
        int[] arr1 = { 1, 2, 3, 4, 5 };
        double[] arr2 = { 1.5, 2.5, 3.5, 4.5, 5.5 };
        try {
	        File file = new File("student.dat");
	        FileOutputStream fos = new FileOutputStream(file);
	        DataOutputStream dos = new DataOutputStream(fos);
	        for (int i = 0; i < arr1.length; i++) {
	                dos.writeInt(arr1[i]);
	                dos.writeDouble(arr2[i]);
	        }
	        dos.close();
        } catch (Exception ex) {
        	System.out.println("WriteBinary(): " + ex.getLocalizedMessage());
        }
	}
	/** 
	 * A simple demonstration of how floating point error creeps in. 
	 * Even the simplest operations might be fraught with danger.
	 */
	public void FloatingPointError() {
		int i, loopCount;
		// Note that alpha is a float. It can represent about 6.5 digits. 
		float alpha = (float)42.0;
		
		loopCount = 1000;
		System.out.println("Executing " + loopCount + " loops...");
		System.out.println("\nBefore the loop, alpha = " + alpha);
		for (i = 0; i < loopCount; i++) {
			alpha += (double).00001;
		}
		System.out.println("\nAfter the first loop, alpha = " + alpha);
		for (i = 0; i < loopCount; i++) {
			alpha -= (double).00001;
		}
		System.out.println("\nAfter the second loop, alpha = " + alpha);

		loopCount = 1000000;
		System.out.println("\nExecuting " + loopCount + " loops...");
		System.out.println("\nBefore the first loop, alpha = " + alpha);
		for (i = 0; i < loopCount; i++) {
			alpha += (double).00001;
		}
		System.out.println("\nAfter the first loop, alpha = " + alpha);
		for (i = 0; i < loopCount; i++) {
			alpha -= (double).00001;
		}
		System.out.println("\nAfter the second loop, alpha = " + alpha);
	
		
		// The magic vanishing decimal digit...
		double beta = 1.00000000002;
		System.out.println("\nbeta = " + beta);
		beta += 1000000;			// The .00000000002 will get lost because the number is now too wide to fit in a double
		System.out.println("\nbeta = " + beta);
		beta -= 1000000;			// The .00000000002 will not come back. 
		System.out.println("\nbeta = " + beta);
	}
	
	
	
}
