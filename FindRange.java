/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	private static final double SENTINEL = 0;
	public void run(){
		println("This program finds the two largest integers in a list." +
				"Enter valutes, one per line, using a 0 to signal the end of" +
				"the list");
		double x = readDouble("? ");
		double largest = x;
		double secondLargest = x;
		while(x != SENTINEL){
			if(x > largest){
				secondLargest = largest;
				largest = x;
			} else if(x > secondLargest){
				secondLargest = x;
			}
			x = readDouble("? ");
		}
		println("The largest value is"+largest+"");
		println("The second largest value is"+secondLargest+"");
	}
	/*public void run() {
		println("This program finds the largest and the smallest numbers.");
		if( readDouble("?: ") == SENTINEL){
			println("no values have been entered");
		} else {
			double x = readDouble("?: ");
			double smallest = x;
			double largest = x;
			while(x != SENTINEL){
				if(x < smallest){
					smallest = x;
				}
				if(x > largest){
					largest = x;
				}
				double x1 = readDouble("?: ");
				x=x1;
			}
			println("smallest: "+smallest+"");
			println("largest:"+largest+"");
		}
	}*/
}

