
//Week 09 topics in Arrays

package week09Package;

public class week09Class {

	public static void main(String[] args) {
		
		/*//int[] score = new int[18];
		
		//declare, instantiate, and initialize the score array all in 1 line
		int[] score = {5,4,3,4,3,2,5,8,5,10,5,4,3,4,3,2,5,8,5,10};
		
		int totalScore = 0;
		for (int i = 0; i < 18; i++) {
			
			totalScore = totalScore + score[i];
			
		}
		
		System.out.println("total score = " + totalScore);
		*/
		int[] myList = {1,5,3,7,8,12,4};
		
		int max = findMax(myList);
		System.out.println("The highest number you have entered is " + max);
		
		int min = findMin(myList);
		System.out.println("The lowest number you have entered is " + min);
	}
	
	private static int findMax(int[] myList) {
		
		int max = myList[0];
		
		for (int i = 1; i < 7; i++){
			
			if (myList[i] > max) {
				
				max = myList[i];
				
			}
			
		}
		return max;
		
	}
	
	private static int findMin(int[] myList) {
		
		int min = myList[0];
		
		for (int i = 1; i > 7; i++){
			
			if (myList[i] > min) {
				
				min = myList[i];
				
			}
			
		}
		return min;
		
	}

}
