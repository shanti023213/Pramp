package com.arrays.pramp;

public class IndexEqualsValue {

	
	
	public static void main(String[] args){
		
		  int arr[] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
		  int arr1[] = {-8,0,2,3};
		  
		  
		  System.out.println("Value: " + indexEqualsValue(arr));
		  System.out.println("Value: " + indexEqualsValue(arr1));
	}
	
	
	public static int indexEqualsValue(int[] a){
		
		int l=0; int r= a.length-1;
		
		while(l<=r){
			
			int mid = (l+r)/2;
			
			if(mid==a[mid]){
				return mid;
			}
			
			if(mid<a[mid]){
				r= mid-1;
			}else{
				
				l= mid+1;
			}
		}
		return -1;
		
		
	}
}
