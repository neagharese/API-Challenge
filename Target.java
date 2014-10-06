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
	private void makeInnerCircle(){
		double x1 = getWidth()/2 - 72;
		double y1 = getHeight()/2 - 72;
		GOval oval = new GOval(x1,y1,144,144);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
	}
	private void makeMiddleCircle(){
		double x1 = getWidth()/2 - (72*0.65);
		double y1 = getHeight()/2 - (72*0.65);
		GOval oval = new GOval(x1,y1,144*0.65,144*0.65);
		oval.setFilled(true);
		oval.setColor(Color.WHITE);
		add(oval);
	}
	private void makeOuterCircle(){
		double x1 = getWidth()/2 - (72*0.3);
		double y1 = getHeight()/2 - (72*0.3);
		GOval oval = new GOval(x1,y1,144*0.3,144*0.3);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
	}
}
