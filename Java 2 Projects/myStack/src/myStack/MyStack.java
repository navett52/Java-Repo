package myStack;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		
		//Declare and instantiate a stack object called checkoutline
		Stack<String> checkOutLine = new Stack<String>();
		
		//Push a team onto the stack
		checkOutLine.push("Bearcats");
		checkOutLine.push("Hawks");
		checkOutLine.push("Hoosiers");
		checkOutLine.push("Purdue");
		
		//Pop off the items on our stack
		checkOutLine.pop();//This will discard the last item added
		
		//Print out how many are left
		System.out.println(checkOutLine.size() + " items left.");
		
		String name = checkOutLine.pop();
		
		System.out.println("The popped item is " + name);
		
		//Put the last thing we popped back onto the stack
		checkOutLine.push(name);
		
		//Peeks at the thing on top of the stack
		name = checkOutLine.peek();//The last thing we pushed
		
		//Pop but immediately push back onto the stack
		checkOutLine.push(checkOutLine.pop());
		
		
	}

}
