package fibonacciEven;

public class SumOfFibonacciEvenNmbers {

	public static void main(String[] args) {

	}
	//1,1,2,3,5,8,13,21,34,55,89
	public static int SumOfEvenFibonacci() {
		int a = 1;
		int b = a;
		int c = 0;
		int sum = 0;
		while (a < 4000000) {
			c = a + b;
			System.out.println(b + " + " + a + " = " + c);
			b = a;
			a = c;
			if (a % 2 == 0) {
				sum += a;
			}
		}
		return sum;
	}

}
