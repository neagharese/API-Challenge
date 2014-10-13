/*
 * File: CS106ATiles.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class CS106ATiles extends GraphicsProgram {
	
	/** Amount of space (in pixels) between tiles */
	private static final int TILE_SPACE = 20;
	private static final int TILE_WIDTH = 200;
	private static final int TILE_HEIGHT = 100;

	public void run() {
		makeTiles();
		fillTiles();
	}
	/* This method creates four rectangles evenly spaced around the center of
	 * the window.
	 * Precondition: none
	 * Postcondition: there are four rectangles evenly spaced around the center of
	 * the window.
	 */
	private void makeTiles(){
		makeRect1();
		makeRect2();
		makeRect3();
		makeRect4();
	}
	/* This method makes the first rectangle to the upper left of the center of
	 * the window.
	 * Precondition:none
	 * Postcondition: there is one rectangle to the upper left of the center of
	 * the window.
	 */
	private void makeRect1(){
		double x1 = (getWidth()/2) - (TILE_SPACE/2) - TILE_WIDTH;
		double y1 = (getHeight()/2) - (TILE_SPACE/2) - TILE_HEIGHT;
		GRect rect1 = new GRect(x1,y1,TILE_WIDTH,TILE_HEIGHT);
		add(rect1);
	}
	private void makeRect2(){
		double x2 = (getWidth()/2) + (TILE_SPACE/2);
		double y2 = (getHeight()/2) - (TILE_SPACE/2) - TILE_HEIGHT;
		GRect rect2 = new GRect(x2,y2,TILE_WIDTH,TILE_HEIGHT);
		add(rect2);
	}
	private void makeRect3(){
		double x3 = (getWidth()/2) + (TILE_SPACE/2);
		double y3 = (getHeight()/2) + (TILE_SPACE/2);
		GRect rect3 = new GRect(x3,y3,TILE_WIDTH,TILE_HEIGHT);
		add(rect3);
	}
	private void makeRect4(){
		double x4 = (getWidth()/2) - (TILE_SPACE/2) - TILE_WIDTH;
		double y4 = (getHeight()/2) + (TILE_SPACE/2);
		GRect rect4 = new GRect(x4,y4,TILE_WIDTH,TILE_HEIGHT);
		add(rect4);
	}
	private void fillTiles(){
		fillFirstTile();
		fillSecondTile();
		fillThirdTile();
		fillFourthTile();
	}
	private double findX(GLabel label){
		double x = label.getWidth()/2;
		return x;
	}
	private double findY(GLabel label){
		double y = label.getHeight()/4;
		return y;
	}
	private void fillFirstTile(){
		GLabel label1 = new GLabel("CS106A");
		label1.setFont("SansSerif-36");
		double x1 = (getWidth() - (TILE_SPACE) - (TILE_WIDTH))/2 - findX(label1);
		double y1 = (getHeight() - (TILE_SPACE) - (TILE_HEIGHT))/2 + findY(label1);
		label1.setLocation(x1,y1);
		add(label1);
	}
	private void fillSecondTile(){
		GLabel label1 = new GLabel("CS106A");
		label1.setFont("SansSerif-36");
		double x1 = (getWidth() + (TILE_SPACE) + (TILE_WIDTH))/2 - findX(label1);
		double y1 = (getHeight() - (TILE_SPACE) - (TILE_HEIGHT))/2 + findY(label1);
		label1.setLocation(x1,y1);
		add(label1);
	}
	private void fillThirdTile(){
		GLabel label1 = new GLabel("CS106A");
		label1.setFont("SansSerif-36");
		double x1 = (getWidth() + (TILE_SPACE) + (TILE_WIDTH))/2 - findX(label1);
		double y1 = (getHeight() + (TILE_SPACE) + (TILE_HEIGHT))/2 + findY(label1);
		label1.setLocation(x1,y1);
		add(label1);
	}
	private void fillFourthTile(){
		GLabel label1 = new GLabel("CS106A");
		label1.setFont("SansSerif-36");
		double x1 = (getWidth() - (TILE_SPACE) - (TILE_WIDTH))/2 - findX(label1);
		double y1 = (getHeight() + (TILE_SPACE) + (TILE_HEIGHT))/2 + findY(label1);
		label1.setLocation(x1,y1);
		add(label1);
	}
	private void writeText(){
		GLabel label1 = new GLabel("CS106A");
		label1.setFont("SansSerif-36");
	}
}

