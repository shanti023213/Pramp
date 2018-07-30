package com.strings.pramp;

public class EncryptDecrypt {


	  static String decrypt(String word) {
	    
	     
	      if(word ==null || word.isEmpty()){
	        return "";
	      }
	    
	   StringBuffer str = new StringBuffer();
	    
	    for(int i=0;i<word.length();i++){
	        if(i==0){
	            int c = (int) word.charAt(i);
	            if(c-1>=97 && c-1<=122){
	               
	            	str.append((char) (c-1));
	            }else{
	            	str.append((char)(c-1+26));
	                
	            }
	          continue;
	         }
	   
	      //n - (n-d) 110 - 100 = 10
	     int temp = (int)word.charAt(i) - (int)word.charAt(i-1);
	        while(temp<97){
	          temp+=26;
	      }
	        str.append((char)temp);
	    }
	    
	    
	    return str.toString();
	  }

	  public static void main(String[] args) {
		 String input ="dnotq";
		System.out.println(decrypt(input));
	  }

	}

