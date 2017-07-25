package multiplesOf3And5;

public class Sum {

	public static void main(String[] args) {
		int answer1 = SumOfMultiplesOfThreeAndFive();
		int finalAnswer = answer1;
		System.out.println(finalAnswer);
	}
	
	public static int SumOfMultiplesOfThreeAndFive() {
		int sumOfMultiples = 0;
 		int multiple = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				multiple = i;
				System.out.println("m " + multiple);
				sumOfMultiples = multiple + sumOfMultiples;
				System.out.println("s " + sumOfMultiples);
			}
		}
		return sumOfMultiples;
	}
}
