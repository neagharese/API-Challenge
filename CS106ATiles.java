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
		makeRect1();
		makeRect2();
		makeRect3();
		makeRect4();
		/*double centerY = getHeight()/2;
		double centerX = getWidth()/2;
		double x1 = centerX - (TILE_SPACE/2) - TILE_WIDTH;
		double y1 = centerY - (TILE_SPACE/2) - TILE_HEIGHT;
		GRect rect1 = new GRect(x1,y1,200,100);
		add(rect1);
		double centerRect1 = rect1.getWidth();
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
		add(rect4);*/
	}
	private void makeRect1(){
		double centerY = getHeight()/2;
		double centerX = getWidth()/2;
		double x1 = centerX - (TILE_SPACE/2) - TILE_WIDTH;
		double y1 = centerY - (TILE_SPACE/2) - TILE_HEIGHT;
		GRect rect1 = new GRect(x1,y1,200,100);
		add(rect1);
		/*double x1 = (getWidth()/2) - (TILE_SPACE/2) - TILE_WIDTH;
		double y1 = (getHeight()/2) - (TILE_SPACE/2) - TILE_HEIGHT;
		GRect rect1 = new GRect(x1,y1,200,100);
		add(rect1);*/
	}
	private void makeRect2(){
		double x1 = (getWidth()/2) - (TILE_SPACE/2);
		double y1 = (getHeight()/2) - (TILE_SPACE/2) - TILE_HEIGHT;
		GRect rect2 = new GRect(x1,y1,200,100);
		add(rect2);
	}
	private void makeRect3(){
		double x1 = (getWidth()/2) - (TILE_SPACE/2);
		double y1 = (getHeight()/2) - (TILE_SPACE/2);
		GRect rect3 = new GRect(x1,y1,200,100);
		add(rect3);
	}
	private void makeRect4(){
		double x1 = (getWidth()/2) - (TILE_SPACE/2) - TILE_WIDTH;
		double y1 = (getHeight()/2) - (TILE_SPACE/2);
		GRect rect4 = new GRect(x1,y1,200,100);
		add(rect4);
	}
	private void fillTiles(){
		double centerY = getHeight()/2;
		double centerX = getWidth()/2;
		double x1 = centerX - (TILE_SPACE/2) - (TILE_WIDTH*6)/7;
		double y1 = centerY - (TILE_SPACE/2) - (TILE_HEIGHT*2)/5;
		GLabel label1 = new GLabel("CS106A",x1,y1);
		label1.setFont("SansSerif-36");
		double lablel1Center = label1.getWidth()/2;
		add(label1);
		double x2 = centerX + (TILE_SPACE/2) + (TILE_WIDTH)/7;
		double y2 = centerY - (TILE_SPACE/2) - (TILE_HEIGHT*2)/5;
		GLabel label2 = new GLabel("CS106A",x2,y2);
		label2.setFont("SansSerif-36");
		add(label2);
		double x3 = centerX + (TILE_SPACE/2) + (TILE_WIDTH)/7;
		double y3 = centerY + (TILE_SPACE/2) + (TILE_HEIGHT*3)/5;
		GLabel label3 = new GLabel("CS106A",x3,y3);
		label3.setFont("SansSerif-36");
		add(label3);
		double x4 = centerX - (TILE_SPACE/2) - (TILE_WIDTH*6)/7;
		double y4 = centerY + (TILE_SPACE/2) + (TILE_HEIGHT*3)/5;
		GLabel label4 = new GLabel("CS106A",x4,y4);
		label4.setFont("SansSerif-36");
		add(label4);
	}
	/*private void makeFirstTile(){
		double centerY = getHeight()/2;
		double centerX = getWidth()/2;
		double x1 = centerX - (TILE_SPACE/2) - TILE_WIDTH;
		double y1 = centerY - (TILE_SPACE/2) - TILE_HEIGHT;
		GRect rect1 = new GRect(x1,y1,200,100);
		add(rect1);
		//double centerRect1 = rect1.getWidth();
		double x2 = centerX - (TILE_SPACE/2) - (TILE_WIDTH*6)/7;
		double y2 = centerY - (TILE_SPACE/2) - (TILE_HEIGHT*2)/5;
		GLabel label1 = new GLabel("CS106A",x2,y2);
		label1.setFont("SansSerif-36");
		double lablel1Center = label1.getWidth()/2;
		add(label1);
	}*/
}

