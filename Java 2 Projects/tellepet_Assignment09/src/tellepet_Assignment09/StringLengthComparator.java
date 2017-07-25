/******************************************************
 * Evan Tellep                                        *
 * Assignment 09                                      *
 * 03/29/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * String length comparator for itemsToPurchase Queue *                                                    
 * Ref:                                               *
 ******************************************************/

package tellepet_Assignment09;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
	/**
	 * compare method compares the length of strings in the queue
	 */
	@Override
	public int compare(String item0, String item1) {
		if (item0.length() < item1.length()) {
			return -1;
		}
		if (item0.length() > item1.length()) {
			return 1;
		}
		return 0;
	}

}
