package com.arrays.pramp;

public class SmallestNonNegativeInteger {
	
	public static void main (String[] args) 
	    {
	        int arr[] ={0, 10, 2, 1, -20};
	        int missing = findMissing(arr);
	        System.out.println("The smallest positive missing number is "+ 
	                            missing);
	    }
	
	
	public static int findMissing(int[] a){
		
		for(int i=0;i<a.length;i++){
			if(a[i]>=0 && a[i]<a.length && a[a[i]]!=a[i]){
				swap(a,a[i], i);
			}
			
		}
		for(int j=0;j<a.length;j++){
				if(a[j]!=j){
					return j;
				}
			}
			
		return a.length;
	
	}
	public static void swap(int[] a , int i, int j){
		
	 int temp= a[i];
	 a[i]= a[j];
	 a[j] = temp;
	}
}
