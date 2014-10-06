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
	private void makeTiles(){
		double centerY = getHeight()/2;
		double centerX = getWidth()/2;
		double x1 = centerX - (TILE_SPACE/2) - TILE_WIDTH;
		double y1 = centerY - (TILE_SPACE/2) - TILE_HEIGHT;
		GRect rect1 = new GRect(x1,y1,200,100);
		add(rect1);
		double x2 = centerX + (TILE_SPACE/2);
		double y2 = centerY - (TILE_SPACE/2) - TILE_HEIGHT;
		GRect rect2 = new GRect(x2,y2,200,100);
		add(rect2);
		double x3 = centerX + (TILE_SPACE/2);
		double y3 = centerY + (TILE_SPACE/2);
		GRect rect3 = new GRect(x3,y3,200,100);
		add(rect3);
		double x4 = centerX - (TILE_SPACE/2) - TILE_WIDTH;
		double y4 = centerY + (TILE_SPACE/2);
		GRect rect4 = new GRect(x4,y4,200,100);
		add(rect4);
	}
	private void fillTiles(){
		double centerY = getHeight()/2;
		double centerX = getWidth()/2;
		double x1 = centerX - (TILE_SPACE/2) - (TILE_WIDTH*(3/4));
		double y1 = centerY - (TILE_SPACE/2) - (TILE_HEIGHT*(3/4));
		GLabel label = new GLabel("CS106A",x1,y1);
		label.setFont("SansSerif-36");
		add(label);
	}
}

