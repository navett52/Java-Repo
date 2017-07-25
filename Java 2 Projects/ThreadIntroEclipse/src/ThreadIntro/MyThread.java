package ThreadIntro;

/**
 * A simple thread class that can be launched from another class.
 * <BR>This class inherits from the Java thread class.
 * <BR>The run() method overrides a method with the same signature in the base class.
 * <BR>
 * @author Nicholson.Bill
 */
public class MyThread extends Thread {
/**
 *  This method is called polymorphically from the base class.
 */
    public void run() {
        int k;
        System.out.println("Hello From the thread.");
        for (k = 0; k < 25; k++) {
        	System.out.println("Hello from thread. k = " + k);
        }
        try {sleep(50000);} catch (Exception ex){}    // milliseconds
        System.out.println("Thread exiting.");
    }
}
