/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class Target extends GraphicsProgram {	
	
	private static final int MIN_RADIUS = 3;
	private static final int MAX_RADIUS = 20;
	private static final int DEFAULT_RADIUS = 7;
	private static final double PAUSE_TIME = 1.0;
	
	public void init(){
		JLabel droplet = new JLabel("Droplet radius: ");
		add(droplet, SOUTH);
		radius = new JSlider(MIN_RADIUS, MAX_RADIUS, DEFAULT_RADIUS);
		add(radius, SOUTH);
		JButton whiteCanvas = new JButton("Fill White");
		add(whiteCanvas, SOUTH);
		JButton blackCanvas = new JButton("Fill Black");
		add(blackCanvas, SOUTH);
		addActionListeners();
	}

	RandomGenerator rgen = RandomGenerator.getInstance();

	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Fill White")){
			removeAll();
		}
		if(e.getActionCommand().equals("Fill Black")){
			removeAll();
			GRect canvas = new GRect(getWidth(), getHeight());
			canvas.setFilled(true);
			canvas.setColor(Color.BLACK);
			add(canvas, 0, 0);
		}
	}
	
	
	public void run() {
		/*makeInnerCircle();
		makeMiddleCircle();
		makeOuterCircle();*/
		while(true){
			Color color = rgen.nextColor();
			int size = 2*radius.getValue();
			double x = rgen.nextInt(0, getWidth());
			double y = rgen.nextInt(0, getHeight());
			GOval circle = new GOval(size, size);
			circle.setFilled(true);
			circle.setColor(color);
			circle.setLocation(x - (size/2), y - (size/2));
			add(circle);
			pause(PAUSE_TIME);
		}

	}
	
	private JSlider radius;
	
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
