package com.arrays.pramp;

import java.util.PriorityQueue;

public class KMessedArraySort {

 static int[] sortKMessedArrayUsingHeap(int[] a, int k) {
	 
	 PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

	 for(int i=0;i<k+1;i++){
		 queue.add(a[i]);
	 }
	 
	 int i=0;
	 for(int j=k+1;j<a.length &k<a.length;j++){
		 
		 int value = queue.poll();
		 a[i++] =value;
		 queue.add(a[j]);
		 
	 }
	 while(!queue.isEmpty()){
		 a[i] = queue.poll();
		 i++;
	 }
	 return a;
 }
 


	  public static void main(String[] args) {
		  
		 int[] a=  {6,1,4,11,2,0,3,7,10,5,8,9};
		 System.out.println(sortKMessedArrayUsingHeap(a,5));
	  }

	}

