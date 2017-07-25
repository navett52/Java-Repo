/*
 * This module doesn't work: gives Initialization error when run as a jUnit Test
 */
package testPackage;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ComplexMathStuffTest.class })
public class AllTests {

}
