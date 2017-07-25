package myDeadlock;

public class MyDeadlock extends Thread {

	public static void main(String[] args) {
		MyDeadlock md = new MyDeadlock();
		md.start();
		MyDeadlock md1 = new MyDeadlock();
		md1.start();
	}
	
	  private static Object lock1 = new Object();
	  private static Object lock2 = new Object();
	 
	  public void run() {
		  MyDeadlock md = new MyDeadlock();
		  md.m1();
		  md.m2();
	  }
	  
	  public void m1() {
	    synchronized (lock1) {
	    	System.out.println("m1 got lock 1");
	    	try {Thread.sleep(5000);} catch (InterruptedException e) {}
	      synchronized (lock2) {
	        System.out.println("foo");
	      }
	    }       
	  }
	 
	  public void m2() {
	    synchronized (lock2) {
	    	System.out.println("m2 got lock 2");
	      synchronized (lock1) {
	        System.out.println("bar");
	      }
	    }       
	  }
}
