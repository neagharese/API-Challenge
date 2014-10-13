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
	/* This method makes the second rectangle to the upper right of the center
	 * of the window.
	 * Precondition: there is one rectangle to the upper left of the center of
	 * the window.
	 * Postcondition: there is one rectangle both to the upper left and right
	 * of the center of the window.
	 */
	private void makeRect2(){
		double x2 = (getWidth()/2) + (TILE_SPACE/2);
		double y2 = (getHeight()/2) - (TILE_SPACE/2) - TILE_HEIGHT;
		GRect rect2 = new GRect(x2,y2,TILE_WIDTH,TILE_HEIGHT);
		add(rect2);
	}
	/* This method makes the third rectangle to the lower right of the center
	 * of the window.
	 * Precondition: there is one rectangle to both the upper left and right of
	 * the center of the window.
	 * Postcondition: there is one rectangle to the upper left, right, and
	 * bottom right of the center of the window.
	 */
	private void makeRect3(){
		double x3 = (getWidth()/2) + (TILE_SPACE/2);
		double y3 = (getHeight()/2) + (TILE_SPACE/2);
		GRect rect3 = new GRect(x3,y3,TILE_WIDTH,TILE_HEIGHT);
		add(rect3);
	}
	/* This method makes the fourth rectangle to the lower left of the center
	 * of the window.
	 * Precondition: there is one rectangle to the upper left, right, and
	 * bottom right of the center of the window.
	 * Postcondition: there are four rectangles evenly spaced around the center
	 * of the window.
	 */
	private void makeRect4(){
		double x4 = (getWidth()/2) - (TILE_SPACE/2) - TILE_WIDTH;
		double y4 = (getHeight()/2) + (TILE_SPACE/2);
		GRect rect4 = new GRect(x4,y4,TILE_WIDTH,TILE_HEIGHT);
		add(rect4);
	}
	/* This method inserts the text into the center of each of the four boxes.
	 * Precondition: there are four rectangles evenly spaced around the center
	 * of the window.
	 * Postcondition: each of those rectanglse has a text centered in it.
	 */
	private void fillTiles(){
		fillFirstTile();
		fillSecondTile();
		fillThirdTile();
		fillFourthTile();
	}
	/* This method finds the center x-value of the text.
	 * Precondition: the text has already been written.
	 * Postcondition: the center x-value of the text is known.
	 */
	private double findX(GLabel label){
		double x = label.getWidth()/2;
		return x;
	}
	/* This method finds the center y-value of the text.
	 * Precondition: the text has already been written.
	 * Postcondition: the center y-value of the text is known.
	 */
	private double findY(GLabel label){
		double y = label.getHeight()/4;
		return y;
	}
	/* This method writes text in the center of the first tile.
	 * Precondition: all of the tiles have been made.
	 * Postcondition: there is text centered in the upper left tile.
	 */
	private void fillFirstTile(){
		GLabel label1 = new GLabel("CS106A");
		label1.setFont("SansSerif-36");
		double x1 = (getWidth() - (TILE_SPACE) - (TILE_WIDTH))/2 - findX(label1);
		double y1 = (getHeight() - (TILE_SPACE) - (TILE_HEIGHT))/2 + findY(label1);
		label1.setLocation(x1,y1);
		add(label1);
	}
	/* This method writes text in the center of the second tile.
	 * Precondition: all of the tiles have been made and there is text centered
	 * in the upper left tile.
	 * Postcondition: there is text centered in the upper tiles.
	 */
	private void fillSecondTile(){
		GLabel label1 = new GLabel("CS106A");
		label1.setFont("SansSerif-36");
		double x1 = (getWidth() + (TILE_SPACE) + (TILE_WIDTH))/2 - findX(label1);
		double y1 = (getHeight() - (TILE_SPACE) - (TILE_HEIGHT))/2 + findY(label1);
		label1.setLocation(x1,y1);
		add(label1);
	}
	/* This method writes text in the center of the third tile.
	 * Precondition: all of the tiles have been made and there is text centered
	 * in the upper tiles.
	 * Postcondition: there is text centered in all of the tiles except the
	 * bottom left tile.
	 */
	private void fillThirdTile(){
		GLabel label1 = new GLabel("CS106A");
		label1.setFont("SansSerif-36");
		double x1 = (getWidth() + (TILE_SPACE) + (TILE_WIDTH))/2 - findX(label1);
		double y1 = (getHeight() + (TILE_SPACE) + (TILE_HEIGHT))/2 + findY(label1);
		label1.setLocation(x1,y1);
		add(label1);
	}
	/* This method writes text in the center of the fourth tile.
	 * Precondition: all of the tiles have been made and there is text centered
	 * in all tiles besides the bottom left one.
	 * Postcondition: there is text centered in all of tiles.
	 */
	private void fillFourthTile(){
		GLabel label1 = new GLabel("CS106A");
		label1.setFont("SansSerif-36");
		double x1 = (getWidth() - (TILE_SPACE) - (TILE_WIDTH))/2 - findX(label1);
		double y1 = (getHeight() + (TILE_SPACE) + (TILE_HEIGHT))/2 + findY(label1);
		label1.setLocation(x1,y1);
		add(label1);
	}
}

