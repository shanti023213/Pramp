package com.arrays.pramp;

public class BusiestTimeInMall {

	public static void main(String[] args) {
		int[][] data ={{1487799425,21,1},{1487799425,4,0},{1487901318,7,0}};

		System.out.println("**"+ findBusiestPeriod(data));
	}
	
	
	static int findBusiestPeriod(int[][] data) {

	    int numberInMall =0; int maxNumberInMall =0; int resultTime =0;
	    
	    int i=0;
	    while(i<data.length){
	      if(data[i][2]==1){
	        numberInMall+=data[i][1];
	      }else{
	        numberInMall-=data[i][1];
	      }
	      if((i+1)<data.length && data[i][0]==data[i+1][0]){
	        i++;
	        continue;
	      }
	      if(numberInMall>maxNumberInMall){
	        maxNumberInMall = numberInMall;
	        resultTime = data[i][0];
	      }
	      i++;
	    }
	    return resultTime;
	  }


}
