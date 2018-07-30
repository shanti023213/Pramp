package com.dynamicProgramming.pramp;

public class RegularPatternMatching {

	static boolean isMatch(String text, String pattern) {
	    
	   
	    if(text.length()==0 || pattern.length()==0){
	    	return true;
	    }
	    
	    boolean[][] a = new boolean[text.length()+1][pattern.length()+1];
	    
	    System.out.println(a.length);
	    System.out.println(a[0].length);
	    
	    for(int i=0;i<a[0].length;i++){
	    		a[0][i] = false;
	    }
	    
	    for(int i=0;i<a.length;i++){
    		a[i][0] = false;
	    }
	    
	    a[0][0] = true;
	    
	    for(int i=1;i<a.length;i++){
	       for(int j=1;j<a[0].length;j++){
	    	   
	    	 if(text.charAt(i-1) == pattern.charAt(j-1) || pattern.charAt(j-1)== '.'){
	              a[i][j] = a[i-1][j-1];
	         }else if(pattern.charAt(j-1)== '*'){
	             if(!a[i][j-2] && (text.charAt(i-1) == pattern.charAt(j-2) ||pattern.charAt(j-2)=='.' )){
		                a[i][j] = a[i-1][j];
		             }else{	
		                a[i][j] = a[i][j-2];
		             }
		     }else if(text.charAt(i-1) != pattern.charAt(j-1)){
	              a[i][j] = false;
	         }
	     }
	    }
	    
	    return a[text.length()-1][pattern.length()-1];
	  }

	  public static void main(String[] args) {
		 System.out.println(isMatch("abaa", "a.*a*"));
		  
	  }

	}

	// This code is contributed by Sumit Ghosh

