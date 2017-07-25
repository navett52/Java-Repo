package ThreadIntro;

import javax.swing.JLabel;

/**
 * A simple thread class that can be launched from another class.
 * <BR>This class inherits from the Java thread class.
 * <BR>The run() method overrides a method with the same signature in the base class.
 * <BR>
 * @author Nicholson.Bill
 */
public class MyThread extends Thread {
	
	private JLabel myLabel;
	private int threadNumber;
	/**
	 * Constructor
	 * @param myLabel The JLabel control where this thread will write its' output
	 */
	public MyThread(JLabel myLabel, int threadNumber) {
		this.myLabel = myLabel;
		this.threadNumber = threadNumber;
	}
/**
 *  This method is called polymorphically from the base class.
 */
    public void run() {
       	myLabel.setText("Hello from thread " + threadNumber + "." );
    }
}
