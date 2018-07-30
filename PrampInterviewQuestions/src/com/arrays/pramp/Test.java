package com.arrays.pramp;

public class Test {
	
	static int[] spiralCopy(int[][] inputMatrix) {

	    
	    if(inputMatrix == null){
	        return new int[0];
	    }
	    if(inputMatrix.length==1 && inputMatrix[0].length==1){
	       int[] result = new int[1];
	      result[0] = inputMatrix[0][0];
	      return result;
	    }
	    
	  
	    int rowMax= inputMatrix.length-1; //0
	    int columnMax= inputMatrix[0].length-1; //1
	    
	    int rowMin= 0;
	    int columnMin=0;
	    
	    int[] outputArray = new int[(rowMax+1)*(columnMax+1)];
	    
	    int k=0;
	    while(rowMin<=rowMax && columnMin<=columnMax){
	      
	      for(int i=columnMin;i<=columnMax;i++){
	          outputArray[k++] =inputMatrix[rowMin][i];
	      }
	      
	      rowMin++;
	      
	      for(int i= rowMin;i<=rowMax;i++){
	        outputArray[k++] =inputMatrix[i][columnMax];
	      }
	      
	      columnMax--;
	      
	      if(rowMin<=rowMax){
	      
	       for(int i= columnMax;i>=columnMin;i--){
	        outputArray[k++] =inputMatrix[rowMax][i];
	      }
	        rowMax--;
	    }
	      
	    if(columnMin<=columnMax){
	      
	       for(int i= rowMax;i>=rowMin;i--){
	        outputArray[k++] =inputMatrix[i][columnMin];
	      }
	      columnMin++;
	    }
	      
	     
	    }
	    
	    return outputArray;
	    
	  
    
	}

	  public static void main(String[] args) {
		  
		  int[][] input = {{1,2,3,4,5},{6,7,8,9,10}};
		  
		  spiralCopy(input);

	  }

	}

