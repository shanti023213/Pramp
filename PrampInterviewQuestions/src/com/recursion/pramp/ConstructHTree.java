package com.recursion.pramp;

public class ConstructHTree {

	
	public static void main(String[] args){
		
	}
	
	public static void constructTree(int x,int y,int length,int depth){
			
		if(depth ==0)
			return;
	
	int x0 = x-(length/2);
	int x1 = x+(length/2);
	int y0 = y+(length/2);
	int y1 = y-(length/2);
	
	drawLine(x0,y,x1,y ,length);
	drawLine(x1,y0,x1,y1,length);
	drawLine(x0,y0,x0,y1,length);
	
	length = length/(int)Math.sqrt(2);
	
	constructTree(x1,y1,length,depth-1);
	constructTree(x1,y0,length,depth-1);
	constructTree(x0,y1,length,depth-1);
	constructTree(x0,y0,length,depth-1);
	
	}
	
	public static void drawLine(int x1,int y1, int x2,int y2,int length){
		
	}
}


