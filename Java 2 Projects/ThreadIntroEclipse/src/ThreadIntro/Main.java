package ThreadIntro;

/**
 * The driver class for the Thread Introduction.
 *  <BR>Run this project multiple times and note that it is not deterministic.
 * @author Nicholson.Bill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        MyThread myThread = new MyThread();
        
 //     start() is a base class method. We didn't have to write it.
//      start() will call our run() when it's good and ready to do so.
        myThread.start();

        for (i = 0; i < 25; i++) {
            System.out.println("Hello from main. i = " + i);
        }
    }
}
