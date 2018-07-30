package com.arrays.pramp;

import java.util.Arrays;
import java.util.Collections;

public class BudgetCuts {
	
	public static void main(String[] args){
		double[] a = {2, 100, 50, 120, 1000};
		double[] ab = {1, 2, 3, 4, 5};

		//System.out.println(budgetCuts(a,190));
		System.out.println(findGrantsCap(a,190));
		
	}

	public static double findGrantsCap(Integer[]a , int newBudget){
		
		Arrays.sort(a, Collections.reverseOrder());
		
		int sum = 0;
		
		for(int i=0;i<a.length;i++){
			sum +=a[i];
		}
		int surplus = sum-newBudget;
		
		if(surplus<=newBudget){
			return a[0];
		}
		
		int i=0;
	    for(i=0;i<a.length;i++){
	        surplus -= (i+1) * (a[i] - a[i+1]);
	        if (surplus <= 0){
	            break;
	        }
		
		
	}
	    return a[i+1] + (-surplus / (double)(i+1));

	}
	
	 public static double FindGrantsCap(double[] grantsArray, double newBudget) // 2, 100, 50, 120, 1000
	    {
	     
	      
	      Arrays.sort(grantsArray);  // ascending order, 2, 50, 100, 120, 1000
	      
	      int length = grantsArray.length; // 3
	      
	      // [2, 4, 6], budget = 3
	      
	      double cap = 0; 
	      double available = newBudget; // 3
	        
	      for(int i = 0; i < length; i++) // i = 0
	      {
	        double visit = grantsArray[i]; // 2
	        
	        boolean needCut = visit * (length - i ) >= available ; // 2 * 3 > 3 => true
	        if(!needCut) // true, false
	        {
	          available -= visit;  // 188
	        }
	        else 
	        {
	         cap = (available * 1.0)  / (double)(length - i ); // 3 / (3 - 0) = 1
	          break; // missing the break, and then the bug was found until line 34 and 35 are added, spent over 30 minutes. 
	        }
	      }
	      
	      return cap; // 47 
	    }
	 
	 
	 public static void budgetCuts(double[] a , double budget){
		 
		 Arrays.sort(a); 
		 
		 double sum =0;
		 for(int i=0;i<a.length;i++){
			 sum+=a[i];
		 }
		 if(sum<=budget){
			 System.out.println("No Cap required");
		 }
		 
		 double cap= 0; double available = budget;
		 for(int i=0;i<a.length;i++){
			
			 double value = a[i] * (a.length-i) ;
			 if(value<=available){
				 available =budget-a[i];
			 }else{
				 cap = available / ((a.length-i));
				 break;
			 }
		 }
		 System.out.println(" Cap required:" + cap);
	 }
	 
	 
	 static double findGrantsCap(double[] grantsArray, double newBudget) {
		    
	      Arrays.sort(grantsArray);
	    
	      int sumsoFar =0; double cap =0; 
	    
	      for(int p=0;p<grantsArray.length;p++){
	        sumsoFar+=grantsArray[p];
	      }
	    
	      if(sumsoFar<=newBudget){
	        return 0.0;
	      }
	  
	    
	      for(int i=0;i<grantsArray.length;i++){
	          if(grantsArray[i]*(grantsArray.length-i) < newBudget){
	              newBudget -=grantsArray[i];
	          }else{
	            cap = newBudget/(grantsArray.length-i);
	            break;
	          }
	      }
	    
	    return cap;
	  }


	}
