package assignment02_redo;

public class Main {

	public static void main(String[] args) {
		
		AB_Redo redo = new AB_Redo();
		
		String string = redo.abRedo(5, 3);
		System.out.println(string);
		
		string = redo.abRedo(3, 2);
		System.out.println(string);
		
		string = redo.abRedo(2, 0);
		System.out.println(string);
		
		string = redo.abRedo(5, 8);
		System.out.println(string);
		
		string = redo.abRedo(10, 12);
		System.out.println(string);
		
	}

}
