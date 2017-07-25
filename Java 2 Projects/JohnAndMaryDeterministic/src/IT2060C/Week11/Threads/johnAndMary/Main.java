/*
 * The starting balance is $42.
 * We will make two deposits to the same account from two threads.
 * John deposits $100
 * Mary Deposits $500
 * Then we will make 1000 deposits of $1 each.
 * 
 * The correct result is a final balance of $1642.
 * 
 * If the code is not synchronized properly, we will get other balances. oopsy.
 */
package IT2060C.Week11.Threads.johnAndMary;

public class Main {

	/**
	 * @param args
	 *            the command line arguments
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Making two deposits...then 1000 more deposits");
		Demo();
		System.out.println("Main exiting");
	}

	/**
	 * Make two deposits to the same account in separate threads. We start with
	 * a balance of $42: John deposits $100, Mary deposits $500.
	 * @throws Exception 
	 */
	private static void Demo() throws Exception {
		// int i;
		// We can access static class members with the class name, we don't need an object name
		for (int j = 0; j < 1; j++) {	// Run the test 10 times just to be sure.
			System.out.println("Test #" + j);
			MakeDeposit.balance = 42;

			/*
			 * We need two instances of the class, each running in a separate
			 * thread
			 */
			MakeDeposit johnThread = new MakeDeposit(100);
			MakeDeposit maryThread = new MakeDeposit(500);

			MakeDeposit[] md = new MakeDeposit[1000];
			// Instantiate a large number of threads, execute the deposits,
			// predict the outcome
			for (int i = 0; i < 1000; i++) {
				md[i] = new MakeDeposit(1);
				md[i].start();
			}
			// Wait for all the threads to finish
			for (int i = 0; i < 1000; i++) {
				try {
					md[i].join();
				} catch (Exception ex) {
				}
			}
			// This sent the program off in the weeds.
			// try {new Thread().sleep(20000); } catch (Exception ex) {}

			// start() is a base class method. We didn't have to write it.
			// start() will call our run() when it's good and ready to do so.
			johnThread.start();
			maryThread.start();

			// Wait for both threads to end... it's ok to eat the exception,
			// probably
			try {
				johnThread.join();
			} catch (InterruptedException e) {
			}
			try {
				maryThread.join();
			} catch (InterruptedException e) {
			}

			// Print the final balance
			System.out.println("The final balance is " + MakeDeposit.balance);
			if (MakeDeposit.balance != 1642) { 
				throw new Exception ("Balance not correct");
			}
		}	// for (int j = 0; j < 10000; j++)
	}
}