package squareDigitChains;

public class SquareDigitChains {
	
	public int squareDigitChains() {
		
		int count89 = 0;
		
		for (int i = 1; i < 10000000; i++) {
			
			System.out.println(i);
			
			int tmpNum = i;
			
			int sumOfDigitsSquared = 0;
			
			while (tmpNum != 1 && tmpNum != 89) {
				
				while (tmpNum != 0) {
				
					int digit = tmpNum % 10;
					
					tmpNum = tmpNum / 10;
					
					sumOfDigitsSquared = (int) (sumOfDigitsSquared + Math.pow(digit, 2));
					
				}
				tmpNum = sumOfDigitsSquared;
				
				sumOfDigitsSquared = 0;
			}
			
			if (tmpNum == 89) {
				count89++;
			}
			
		}
		
		return count89;
		
	}
	
}
