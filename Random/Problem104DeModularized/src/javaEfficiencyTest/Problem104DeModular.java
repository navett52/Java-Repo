package javaEfficiencyTest;

import java.math.BigInteger;

public class Problem104DeModular {

	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		System.out.println("Started as " + startTime + " milliseconds");
		int result = 0;
		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.ONE;
		BigInteger n3 = BigInteger.ZERO;
		BigInteger tmp = BigInteger.ZERO;
		int k = 3;
		String s1, s2;
		// First we must compute the test case described in the problem description:
		// This loop counts up to F2749. 
		for (k = 3; k < 2749+1; k++) {
			tmp = n1.add(n2);
			n2 = new BigInteger(n1.toString()); 
			n1 = new BigInteger(tmp.toString());
			/*
			 * This part is not needed -- it just proves that everything is working by testing the example, F541, desceibed in the problem description.
			if (k == 541) {
				//System.out.println("k=541");
				s1 = n1.toString().substring(0, 9);
				int len = n1.toString().length();
				s2 = n1.toString().substring(len - 9, len);
				if (isPandigital(s2)) {
					//System.out.println("k = " + k + ": last 9 digits are pandigital" );
					if (isPandigital(s1)) {
						//System.out.println("k = " + k + ": first 9 digits are pandigital" );
						break;
					}
				}
			}
			*/
			//System.out.println("k = " + k + ": " + n1.toString());
		}
		//System.out.println("Algorithm starting...");
		int mode = 1;
		int len;
		String tmpString;
		boolean keepGoing = true;
		while (keepGoing) {
			switch (mode % 2) {
			case 0:		// Mode 1 => add n1 & n2, store result in n1 and process n1
				n1 = n1.add(n2);
				tmpString = n1.toString();
				s1 = tmpString.substring(0, 9);
				boolean resultP1 = true;
				int len1 = s1.length();
				byte[] b1 = s1.getBytes();
				byte t1[] = {0,1,1,1,1,1,1,1,1,1};	// The first element is '0', which we don't care about.
				for (int i = 0; i < len1; i++) {
					t1[(b1[i]-48)] = 0;
				}
				for (int i = 0; i < 10; i++) {if (t1[i] == 1) resultP1 = false;}
				len = tmpString.length();
				s2 = tmpString.substring(len - 9, len);
				boolean resultP2 = true;
				int len2 = s2.length();
				byte[] b2 = s2.getBytes();
				byte t2[] = {0,1,1,1,1,1,1,1,1,1};	// The first element is '0', which we don't care about.
				for (int i = 0; i < len2; i++) {
					t2[(b2[i]-48)] = 0;
				}
				for (int i = 0; i < 10; i++) {if (t2[i] == 1) resultP2 = false;}
				if (resultP1) {
					//System.out.println("k = " + k + ": first 9 digits are pandigital (" +  s1 + ", " + s2 + ")");
					if (resultP2) {
						//System.out.println("k = " + k + ": last 9 digits are pandigital" );
						keepGoing = false;
					}
				}
				break;				
			case 1:		// Mode 2 => add n1 & n2, store result in n2 and process n2 
				n2 = n1.add(n2);
				tmpString = n2.toString();
				s1 = tmpString.substring(0, 9);
				resultP1 = true;
				len1 = s1.length();
				b1 = s1.getBytes();
				byte t1a[] = {0,1,1,1,1,1,1,1,1,1};	// The first element is '0', which we don't care about.
				for (int i = 0; i < len1; i++) {
					t1a[(b1[i]-48)] = 0;
				}
				for (int i = 0; i < 10; i++) {if (t1a[i] == 1) resultP1 = false;}
				len = tmpString.length();
				s2 = tmpString.substring(len - 9, len);
				resultP2 = true;
				len2 = s2.length();
				b2 = s2.getBytes();
				byte t2a[] = {0,1,1,1,1,1,1,1,1,1};	// The first element is '0', which we don't care about.
				for (int i = 0; i < len2; i++) {
					t2a[(b2[i]-48)] = 0;
				}
				for (int i = 0; i < 10; i++) {if (t2a[i] == 1) resultP2 = false;}
				if (resultP1) {
					//System.out.println("k = " + k + ": first 9 digits are pandigital (" +  s1 + ", " + s2 + ")");
					if (resultP2) {
						//System.out.println("k = " + k + ": last 9 digits are pandigital" );
						keepGoing = false;
					}
				}
				break;
			default:
				try {
					throw new Exception ("Invalid mode (" + mode % 2 + ")");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			k++;
			mode++;
			//if (k % 10000 == 0) System.out.println("k = " + k);
		}
		result = k-1;		// Subtract one because the while() loop has to restart in order for the keepGoing flag to kick us out. 
		System.out.println("Problem 104: " + result);
		final long endTime = System.currentTimeMillis();	
		System.out.println("Total execution time in seconds: " + ((double)((endTime - startTime)))/1000 );
	}

}
