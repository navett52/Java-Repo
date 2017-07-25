package exception;

public class Main {

	public static void main(String[] args) {
		String coordinateFileName = "coord_-1,10";
		//This works fine
		String coordinate = coordinateFileName.substring(6, 8);
		System.out.println(coordinate);
		
		if(coordinateFileName.charAt(6) == '-') {
			System.out.println("This is a negative number");
		}
		
		String[] test = new String[2];
		String coord1;
		test[0] = "coord_-2,32";
		test[1] = "coord_-3,23";
		for (int i = 0; i < test.length; i++) {
			if (test[i].charAt(6) == '-') {
				coord1 = test[i].substring(6, 8);
			} else {
				coord1 = test[i].substring(6, 7);
			}
			System.out.println(coord1);
		}
		
		String coord2 = coordinateFileName.substring(coordinateFileName.charAt('_' + 1), coordinateFileName.charAt(','));
		System.out.println(coord2);
		//This does not work, but I thought I was able to supply a character and it would
		//return the index of that character within the string, but now I'm feeling like
		//instead of returning the index, it just uses a numerical value of the char?
		String coord = coordinateFileName.substring('_', ',');
		System.out.println(coord);
		
	}

}
