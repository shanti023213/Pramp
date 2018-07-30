package com.arrays.pramp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairsWithGivenDiff {

	static int[][] findPairsWithGivenDifference(int[] arr, int k) {
		       if(arr ==null || arr.length==0 || arr.length ==1){
		        return new int[0][0];
		      }
		    
		    Set<Integer> set = new HashSet<Integer>();
		    Map<Integer, Integer> map = new HashMap<Integer,Integer>();

		    for(int i=0;i<arr.length;i++){
		      set.add(arr[i]);
		    }
		    for(int i=0;i<arr.length;i++){
		        if(set.contains(arr[i]-k)){ 
		          map.put(arr[i],arr[i]-k);
		        }
		   }
		    
		   int[][] result = new int[map.size()][2];
		    int i=0;
		    for(Integer a:map.keySet()){
		        result[i][0] = a;
		        result[i][1] = map.get(a);
		        i++;
		    }
		    
		    return result;
		  }

		  public static void main(String[] args) {

			  int[] arr = {4,1};
			  int k = 3;
			  findPairsWithGivenDifference(arr,k);
		  }

		
}
