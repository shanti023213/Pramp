package com.arrays.pramp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindPairsWithDiff {
	
	
	//If not this put all elements in set and then check arr[i]- k is in set if so add it to linked
	//hashmap and then move them to array[][]. this facilitates multiple filtering can reduce traversing time
	static int[][] findPairsWithGivenDifference(int[] arr, int k) {

	      if(arr ==null || arr.length==0 || arr.length==1){
	        return new int[0][0];
	      }
	    
	      Set<Integer> set = new HashSet<Integer>();
	      int count =0;
	      for(int i=0;i<arr.length;i++){
	          set.add(arr[i]);
	      }
	    
	    for(int i=0;i<arr.length;i++){
	          if(set.contains(arr[i]-k)){
	            count++;
	          }
	      }
	    
	    int[][] result = new int[count][2];
	    int p=0;
	    for(int i=0;i<arr.length;i++){
	        if(set.contains(arr[i]+k)){
	              result[p][0] = arr[i]+k;
	              result[p][1] = arr[i];
	              p++;
	        }
	    }
	    return result;
	}

	  public static void main(String[] args) {

		 int[] arr= {0, -1, -2, 2, 1};
		 int k = 1;
		 
		 int[][] a =findPairsWithGivenDifference(arr,k);
		 
		 for(int i=0;i<a.length;i++){
			 System.out.println(a[0]);
		 }
		 
	  }

}
