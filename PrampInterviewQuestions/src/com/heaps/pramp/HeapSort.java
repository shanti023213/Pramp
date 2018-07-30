package com.heaps.pramp;

import java.util.HashMap;
import java.util.Map;

public class HeapSort {
	
	public static int[] sortKMessedArrayUsingHeap(int[] a){
		
		for(int i= (a.length/2)-1 ;i>=0;i--){
			maxHeapify(a,i,a.length);
		}
		
		int size = a.length;
		for(int i=0;i<a.length;i++){
			
			int temp = a[0];
			a[0]= a[size-1];
			a[size-1] = temp;
			size--;
			maxHeapify(a,0,size);
		}
		return a;
	}
	
	public static void maxHeapify(int[]a , int i , int heapSize){
		
		int l= 2*i+1; int r = 2*i+2; int largest =i;
		
		if( l<heapSize && a[l]>a[largest]){
			largest = l;
		}
		
		if( r<heapSize && a[r]>a[largest]){
			largest = r;
		}
		
		if(largest!=i){
			
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxHeapify(a,largest,heapSize);
		}
		
		}
	
	  public static void main(String[] args) {
		  
			 int[] a=  {6,1,4,11,2,0,3,7,10,5,8,9};
			 int[] a1=  {0,1};
			 System.out.println(sortKMessedArrayUsingHeap(a1));
		  }
}

