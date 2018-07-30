package com.arrays.pramp;

public class FindElementInRotatedSortedArray {
	
	public static void main(String[] args) {
		
		int[] a = {5,9,12,17,2,4};
		int[] b = {1,2,3,4,5,6,7};
		int[] c= {1,2};
		System.out.println("Element index:"+ shiftedArrSearch(a,17));
	}


	  static int shiftedArrSearch(int[] shiftArr, int num) {
		  
	    int pivot= findPivot(shiftArr);
	    if(pivot==shiftArr.length-1){
	    	return binarySerch(shiftArr, 0, shiftArr.length-1, num);
	    }else if(shiftArr[0]>num){
	    	return binarySerch(shiftArr, pivot+1, shiftArr.length-1, num);
	    }else{
	    	return binarySerch(shiftArr, 0, pivot, num);
	    }

	  }
	  
	  public static int binarySerch(int[] a , int start, int end,int key){
		  
		  int l= start ; int r =end;
		  while(l<=r){
			  int mid = (l+r)/2;
			  if(a[mid]==key){
				  return mid;
			  }else if(a[mid]<key){
				  l=mid+1;
			  }else{
				  r = mid=1;
			  }
			  
		  }
		  return -1;
	  }
	  public static int findPivot(int[] a){
		  
		  int l= 0; int r = a.length-1;
		  
		  while(l<=r){
			  
			  if(l==r){
				  return l;
			  }
		
			  int mid= (l+r)/2;
			  if(a[mid]>=a[l] && a[mid] > a[mid+1]){
				  return mid;
			  }else if(a[mid]>=a[l] && a[mid] < a[mid+1]){
				  l =mid+1;
			  }else{
				  r= mid-1;
			  }
		  }
		  
		  return -1;
	  }
}
