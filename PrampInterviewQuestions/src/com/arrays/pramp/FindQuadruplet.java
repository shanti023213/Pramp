package com.arrays.pramp;

import java.util.Arrays;

public class FindQuadruplet {
	 static int[] findArrayQuadruplet(int[] arr, int s) {
	    
	    if(arr ==null || arr.length ==0){
	      return new int[0];
	    }
	    if(arr.length ==1 || arr.length <4){
	      return new int[0];
	    }
	    Arrays.sort(arr);
	    
	    int sum; int l; int r; int[] result = new int[4];
	     
	    // [1,2,3,4,5,9,19,12,12,19]  40
	    //  1 2 3 4 5 9 12 12 19 19
	    // 0 1 2 3 4 5 7 9
	    // 0 1 2 3 4 5 6 7 
	     //4 4 4 4
	    for(int i=0;i<arr.length-3;i++){
	      
	      for(int j=i+1;j<arr.length-2;j++){
	          sum = arr[i]+arr[j];
	          l = j+1;
	          r = arr.length-1;
	        
	        while(l<r){
	        
	        if(arr[l]+arr[r]<s-sum){
	           l++;
	        }else if (arr[l]+arr[r]>s-sum){
	          r--;
	        }else if(arr[l]+arr[r] ==s-sum){
	          return new int[] {arr[i],arr[j],arr[l],arr[r]};
	        }
	      }
	      }
	      
	    }
	    
	    return new int[0];
	  }

	  public static void main(String[] args) {

		  int[] a = {1,2,3,4,5,9,19,12,12,19};
		  findArrayQuadruplet(a, 40);
	  }

	}


