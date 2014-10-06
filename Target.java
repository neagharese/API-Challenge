/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		makeInnerCircle();
		makeMiddleCircle();
		makeOuterCircle();
	}
	/* Creates the biggest, innermost circle and colors it red.
	 * Precondition: The window is empty
	 * Postcondition: There is a red circle in the middle of the
	 * window.
	 */
	private void makeInnerCircle(){
		double x1 = getWidth()/2 - 72;
		double y1 = getHeight()/2 - 72;
		GOval oval = new GOval(x1,y1,144,144);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
	}
	/* Creates the middle circle and colors it white.
	 * Precondition: The window contains the biggest red circle.
	 * Postcondition: There is a white circle centered in the red
	 * circle.
	 */
	private void makeMiddleCircle(){
		double x1 = getWidth()/2 - (72*0.65);
		double y1 = getHeight()/2 - (72*0.65);
		GOval oval = new GOval(x1,y1,144*0.65,144*0.65);
		oval.setFilled(true);
		oval.setColor(Color.WHITE);
		add(oval);
	}
	/* Creates the smallest, outermost circle and colors it red.
	 * Precondition: The window contains both the largest red
	 * circle and the middle white circle.
	 * Postcondition: There is a smaller red circle in the white
	 * circle and the target is complete at the center of the
	 * window.
	 */
	private void makeOuterCircle(){
		double x1 = getWidth()/2 - (72*0.3);
		double y1 = getHeight()/2 - (72*0.3);
		GOval oval = new GOval(x1,y1,144*0.3,144*0.3);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
	}
}
