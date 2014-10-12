/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a number: ");
		int x =1;
		while(n != 1){
			//int x = 1;
			if(n%2 == 2){
				int n2 = n/2;
				println(""+n+"is even so I take half: "+n2+"");
				n = n2;
			} /*else {
				int n2 = 3*n +1;
				println(""+n+"is odd, so I tak 3n + 1: "+n2+"");
				n = n2;
			}*/
			x = x+1;
		}
		println("The process took "+x+" to reach 1");
	}
}

