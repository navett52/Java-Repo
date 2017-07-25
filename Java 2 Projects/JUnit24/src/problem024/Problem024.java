/**
 * Project Euler Problem 024
 * ProjectEuler.net
 * 
 * A permutation is an ordered arrangement of objects.
 * For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
 * If all of the permutations are listed numerically or alphabetically,
 * we call it lexicographic order.
 * The lexicographic permutations of 0, 1 and 2 are:
 * 012   021   102   120   201   210
 * What is the millionth lexicographic permutation of the digits
 *  0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 *
 * Solution = 2783915460
 *
*/

package problem024;

/**
 *
 * @author Nicholson.Bill
 */
public class Problem024 {

    public static long Solve() {

        long result = 0;
        long tmp = 0, num = 123456789;
        int digit = 0, i, j;
        int digitCount[] = new int[10];
        boolean candidate = false;
        i = 0;
        try {
            while (true) {
//            System.out.println("Testing " + num);
                for (j = 0; j < 10; j++) {
                    digitCount[j] = 0;
                }
                tmp = num;
//          See if it's a candidate. No digit can be repeated.
                for (j = 0; j < 10; j++) {
                    digit = (int)(tmp % 10);
                    digitCount[digit]++;
                    tmp = tmp / 10;
                }
                candidate = true;       // Hope for the best
                for (j = 0; j < 10; j++) {
                    if (digitCount[j] > 1) {
                        candidate = false;
                        break;
                    }
                }
                if (candidate) {
                    if ((i % 10000) == 0) {
                        System.out.println("Candidate " + num + " i= " + i);
                    }
                    i++;
                    if (i == 1000000) {
                        result = num;
                        break;			// we found the 1 millionth lexicographic permutation. Yay.
                    }
                }
                num++;
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            System.out.println(" i= " + i + " tmp = " + tmp + " num = " + num + " digit = " + digit);
        }
        return result;
    }
}
