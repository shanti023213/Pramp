package com.dynamicProgramming.pramp;

public class NoOfPaths {
	

	 public static void main(String[] args) {
		  System.out.println(numOfPathsToDest2(5));
	 } 
	 
	 public static int numOfPathsToDest(int n){
		 
		 if(n==1){
			 return 1;
		 }
		 
		 int[] lastRow = new int[n];
		 for(int i=1 ;i<n ;i++){
		 	lastRow[i] =1;
		 }
		 
		 int[] currentRow = new int[n];
		 
		 for(int j=1 ;j<n ;j++){
			 for(int i=j ;i<n ;i++){
				 if (i == j){
		                currentRow[i] = lastRow[i];
				 }else{
		                currentRow[i] = currentRow[i-1] + lastRow[i];
		                lastRow[i] = currentRow[i];
				 }
			 } 
			 
		 }
		 return currentRow[n-1];
		 
	 }
	 
	 public static int numOfPathsToDest2(int size){
		 
		// int size =n-1;
		 
		 int[][] result = new int[size][size];
		 
		 result[0][0] =1;
		 for(int i=1;i<size;i++){
			 result[i][0] =1;
		 }
		 for(int i=1;i<size;i++){
			 
			 for(int j=1;j<=i;j++){
				 result[i][j] = result[i][j-1]+result[i-1][j];
			 }
		 }
		 return result[size-1][size-1];
	 }
	 
	 
	 public static int numOfPathsToDest3(int size){
		 
			// int size =n-1;
			 int[] row1 = new int[size];
			 int[] row2 = new int[size];
			 
			 for(int i=1;i<size;i++){
				 
				 for(int j=1;j<=i;j++){
					
				
				 }
			 }
			 
			 
			 int[][] result = new int[size][size];
			 
			 result[0][ 0] =1;
			 for(int i=1;i<size;i++){
				 result[i][0] =1;
			 }
			 for(int i=1;i<size;i++){
				 
				 for(int j=1;j<=i;j++){
					 result[i][j] = result[i][j-1]+result[i-1][j];
				 }
			 }
			 return result[size-1][size-1];
		 }
	 }
