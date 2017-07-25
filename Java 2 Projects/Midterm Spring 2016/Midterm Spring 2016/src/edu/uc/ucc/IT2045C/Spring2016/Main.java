// Midterm Exam 
// IT2045C Spring 2016
// Bill Nicholson
// nicholdw@ucmail.uc.edu
//

package edu.uc.ucc.IT2045C.Spring2016;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Hacker> hackers = new ArrayList<Hacker>(); 
		
		ArrayList<String> languages = new ArrayList<String>();
		languages.add("C");
		languages.add("C++");
		languages.add("FORTRAN");
		hackers.add(new Hacker(10,"Bob", "Data Bandit", languages));
		
		languages.clear();
		languages.add("perl");
		languages.add("php");
		languages.add("python");
		hackers.add(new Hacker(1,"Paul", "P-Boy", languages));
		
		
		languages.clear();
		languages.add("perl");
		languages.add("Go");
		languages.add("VBA");
		hackers.add(new Hacker(11,"Sally", "Sweety", languages));

		languages.clear();
		languages.add("8086 Assembly");
		languages.add("8051 Assembly");
		languages.add("6502 Assembly");
		hackers.add(new Hacker(1,"Dirk", "BitCowboy", languages));
		
		languages.clear();
		languages.add("C#");
		languages.add("Javascript");
		languages.add("Visual Basic");
		languages.add("Java");
		hackers.add(new Hacker(2,"Ian", "NerdHacker2000", languages));
		
		languages.clear();
		languages.add("Algol");
		languages.add("Pascal");
		languages.add("COBOL");
		languages.add("Java");
		hackers.add(new Hacker(99,"Brenda", "NurseHacker", languages));
		Collections.sort(hackers);
		
		Hacker.Print(hackers);
		
	}

}
