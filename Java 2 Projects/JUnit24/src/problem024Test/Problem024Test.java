package problem024Test;

import static org.junit.Assert.*;
import org.junit.Test;

import problem024.Problem024;

public class Problem024Test {

	/**
	 * A classic black box test.
	 */
	@Test public void test() {
		long result = Problem024.Solve(); 
		// Note the L so we can have a literal that is bigger than a signed integer data item. L for 'long'
		assertTrue("Solve() gives incorrect answer", result == 2783915460L );		
	}

}
