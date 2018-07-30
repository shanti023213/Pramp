package com.arrays.pramp;

public class DroveFlight {

	public static void main(String[] args) {

		
		int[][] route = {{0,   2, 10},
                  	     {3,   5,  0},
                         {9,  20,  6},
                         {10, 12, 15},
                         {10, 10,  8} };	
		
		int[][] a = {{0,2,6},{10,10,20}};
		

		int[][] b= {{0,2,2},{3,5,38},{9,20,6},{10,12,15},{10,10,8}};
		
		int energyNeeded = largestEnergyNeeded(b);
		
		System.out.println("Energy needed" + energyNeeded);

	}
	
	
	public static int largestEnergyNeeded(int[][] a){
		
		int energyShortBy=0; int energy=0;
		
		for(int i=1;i<a.length;i++){
			
			energy = energy+(a[i-1][2]-a[i][2]);
			
			if(energyShortBy>energy){
				energyShortBy = energy;
			}
			
		}
		
	
		return -1*energyShortBy;
	}

	
//Method 2
	 static int calcDroneMinEnergy(int[][] a) {	   
	   int maxHeight = a[0][2];

	   for (int i=1 ;i<a.length; i++){
	       if (a[i][2] > maxHeight){
	           maxHeight = a[i][2];
	   }
	   }
	   return maxHeight - a[0][2];
	  }
}
