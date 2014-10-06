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
		//makeMiddleCircle();
		//makeOuterCircle();
	}
	private void makeInnerCircle(){
		double x1 = getWidth()/2 - 72;
		double y1 = getHeight()/2 - 72;
		GOval oval = new GOval(x1,y1,144,144);
		oval.setFillColor(Color.RED);
		add(oval);
	}
}
