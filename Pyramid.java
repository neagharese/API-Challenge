/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		//int x = BRICK_HEIGHT * numberOfRows();
		int numberOfBricks = BRICKS_IN_BASE; 
		for(int i = 1; i <= numberOfRows(); i++ ){
			double y1 = getHeight() - i*BRICK_HEIGHT;
			layBricks(numberOfBricks,y1);
			numberOfBricks = numberOfBricks-1;
		}
	}
	private int numberOfRows(){
		int x = 1;
		int n = BRICKS_IN_BASE; 
		while (n>1){
			n = n-1;
			x = x+1;
		}
		return x;
	}
	private void layBricks(int numberOfBricks,double y1){
		double x1 = findX(numberOfBricks);
		for(int i=0; i<numberOfBricks; i++){
			GRect rect = new GRect(x1,y1,BRICK_WIDTH,BRICK_HEIGHT);
			add(rect);
			x1 = x1 + BRICK_WIDTH;
		}
	}
	private double findX(int numberOfBricks){
		double X = getWidth()/2 - (numberOfBricks*BRICK_WIDTH)/2;
		return X;
	}
	private double findY(int rowNumber){
		double Y = getHeight() - rowNumber*BRICK_HEIGHT;
		return Y;
	}
}

