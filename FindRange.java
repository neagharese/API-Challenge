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
	}
}

