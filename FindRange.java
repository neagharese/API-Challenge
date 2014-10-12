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
	public void run() {
		println("This program finds the largest and the smallest numbers.");
		double x = readDouble("?: ");
		double smallest = x;
		double largest = x;
		if( x == SENTINEL){
			println("no values have been entered");
		} else {
			while(readDouble("?: ") != SENTINEL){
				if(x < smallest || x<0 && x<smallest){
					smallest = x;
				}
				if(x>largest){
					largest = x;
				}
			}
			println("smallest: "+smallest+"");
			println("largest:"+largest+"");
		}
	}
}

