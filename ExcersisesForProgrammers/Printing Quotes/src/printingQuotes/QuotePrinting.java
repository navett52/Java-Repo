package printingQuotes;

import java.util.Scanner;

public class QuotePrinting {
	
	public void PrintQuote() {
		
		Scanner scanner = new Scanner(System.in);
		
		String author = null;
		
		String saying = null;
		
		System.out.print("What is the quote?");
		saying = scanner.next();
		
		System.out.print("Who said it?");
		author = scanner.next();
		
		System.out.println(author + " says " + "\"" + saying + "\"");
		
	}

}
