package com.arrays.pramp;

import java.util.ArrayList;

public class FindDuplicates {
	
	
static int[] findDuplicates(int[] arr1, int[] arr2) {
	    
	    int i=0;int j=0;
	    
	   
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    while((i<arr1.length) && (j<arr2.length)){
	      
	      if(arr1[i]==arr2[j]){
	          list.add(arr1[i]);
	           i++;
	          j++;
	         
	      }else if(arr1[i]<arr2[j]){
	         i= i+1;
	        
	      }else{
	        j =j+1;
	      }
	    }
	    
	
	    int[] intArray = new int[list.size()];
	    for (int k = 0; k < intArray.length; k++) {
	        intArray[k] = list.get(k);
	    }
	    
	    return intArray;
	  }

	  public static void main(String[] args) {

		  int[] arr1 = {10,20,30,40,50,60,70,80,100,120,150,170,190,200};
		  int[] arr2 = {50,60};
		  findDuplicates2(arr1,arr2);
	  }
	  
	  //when size of one array is so high so better do binary search
	  
	  public static int[] findDuplicates2(int[] arr1, int[] arr2){
		  
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  
		  int l=0;int r=arr1.length;
		  for(int i=0;i<arr2.length;i++){
			  
			  
		  }
		  return new int[5];
	  }

	}


