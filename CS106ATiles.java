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

	public void run() {
		makeTiles();
		//fillTiles();
	}
	private void makeTiles(){
		double centerY = getHeight()/2;
		double centerX = getWidth()/2;
		double x1 = centerX - (TILE_SPACE/2);
		double y1 = centerY - (TILE_SPACE/2);
		GRect rect = new GRect(centerX,y1,200,100);
		add(rect);
	}
}

