package com.arrays.pramp;

public class ProductOfArrayElements {
	
	
	public static void main(String[] args){
	
	int[] a = {8,10,2};
	
	int[] b = productArray(a);
	
	for(int i=0;i<b.length;i++){
		
		System.out.println("Product" + b[i]);
	}
	}
	
	
	public static int[] productArray(int[] a){
		
		int temp =1; int[] product = new int[a.length];
		
		for(int i=0;i<a.length;i++){
			product[i] = temp;
			temp *= a[i];
			
		}
		
		temp =1;
		for(int i= a.length-1;i>=0;i--){
			
			product[i] *= temp;
			temp*=a[i];
		}
		return product;
	}
}
