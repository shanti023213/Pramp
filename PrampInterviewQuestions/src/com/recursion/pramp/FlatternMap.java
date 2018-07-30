package com.recursion.pramp;

import java.util.HashMap;
import java.util.Map;

public class FlatternMap {
	
	public static void main(String[] args){
		/* dict = {
		            "Key1" : "1",
		            "Key2" : {
		                "a" : "2",
		                "b" : "3",
		                "c" : {
		                    "d" : "3",
		                    "e" : {
		                        "" : "1"
		                    }
		                }
		            }
		        }*/
		 
		 
		 
		 
		 HashMap<String,Object> inner1 = new HashMap<String,Object>();
		 inner1.put("","1");
		 
		 HashMap<String,Object> inner2 = new HashMap<String,Object>();
		 inner2.put("d","3");
		 inner2.put("e", inner1);
		 
		 HashMap<String,Object> inner3 = new HashMap<String,Object>();
		 inner3.put("a","2");
		 inner3.put("b","3");
		 inner3.put("c",inner2);
		 
		 HashMap<String,Object> map = new HashMap<String,Object>();
		 map.put("Key1", "1");
		 map.put("Key2", inner3);
		 HashMap<String, String> result = flattenDictionary(map);
		 System.out.println("**********");
		 
	}
	
	
	static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
		   
	      if(dict == null || dict.size()==0){
	        return null;
	      }
	    
	     HashMap<String, String> resultMap = new HashMap<String, String>();
	    
	    
	     helper(dict, resultMap, new String());
	      
	    return resultMap;
	      
	    
	  }
	  
	  
	  public static void helper(HashMap<String, Object> dict,HashMap<String, String> result,String str){
	    
	    for(String key: dict.keySet()){
	        
	          Object value = dict.get(key);
	       
	          if(value instanceof String || value instanceof Integer){
	        	  
	        	  if(key.equals("")){
	        		  result.put(str,String.valueOf(value));
	        	  }else if(str.equals("")){
	           
	              result.put(key,String.valueOf(value));  //key2.b
	        	  } else{
	        		  result.put(str+'.'+key,String.valueOf(value));
	        	  }   
	          }else if(value instanceof Map){
	        	  

	        	  if(key.equals("")){
	        		  helper((HashMap) value, result,str);
	        	  }else if(str.equals("")){
	        		  helper((HashMap) value, result,key);
	        	  }else
	           
	        		  helper((HashMap) value, result,str+'.'+key);
	           
	             
	          }
	      }
	  } 
	  
	 

}
