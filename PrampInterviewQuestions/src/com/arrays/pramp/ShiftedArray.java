package com.arrays.pramp;

public class ShiftedArray {
	
	public static void main(String args[])
	    {
	       
	       int arr1[] = {1,2};
	       int key = 2;
	       System.out.println("Index of the element is: "
	                      + searchInSortedRotatedArray(arr1, 0,arr1.length-1, key));
	    }
	

	public static  int searchInSortedRotatedArray(int[] arr, int start, int end, int key)
	{
	    if (start > end) 
	    	return -1; 
	    
	    int middle = (start + end)/2;
	    
	    if (arr[middle] == key) 
	    	return middle;
	 
	    if (arr[start] <= arr[middle])
	        return (key >= arr[start] && key <= arr[middle])? searchInSortedRotatedArray(arr, start, middle-1, key):
	    searchInSortedRotatedArray(arr, middle+1, end, key);
	    return (key >= arr[middle] && key <= arr[end])? searchInSortedRotatedArray(arr, middle+1, end, key):
	    searchInSortedRotatedArray(arr, start, middle-1, key); 
	}
	
	public static  int binarySearch(int[] arr, int start, int end, int key)
	{
	   int l= start; int r = end;
		while(l<=r){
			
			int mid = (l+r)/2;
			if(arr[mid]==key){
				return mid;
			}
			if(key>arr[mid] && key<=arr[r])
			{
				l= mid+1;
			}
			
			if(key>arr[mid] && key>arr[r])
			{
				r= mid-1;
			}
			
			if(key<arr[mid] && key>=arr[l]){
				r =mid-1;
			}
			
			if(key<arr[mid] && key<arr[l]){
				l =mid+1;
			}
		}
		return -1;
	}
	 
	
}

