package com.maps.pramp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestWordCountFinal {

	static String[][] wordCountEngine(String document) {
		
		 String updatedString = document.toLowerCase();
		 String[] wordList = updatedString.split(" ");
		 Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		 
		 int countMax =Integer.MIN_VALUE;
		
		 
		 for(String str:wordList){
			 String result = helper(str);
			 if(result.equals("")){
				 continue;
			 }
			 int count=0;
			 if(map.containsKey(result)){
				 map.put(result, map.get(result)+1);
				 count=map.get(result);
			 }else{
				 map.put(result, 1);
				 count =1;
			 }
			 
			 if(count>countMax){
				 countMax= count;
			 }
		 }
	
		LinkedList<String>[] list = new LinkedList[countMax+1];
		
		for(int i=0;i<list.length;i++){
			list[i] = new LinkedList<String>();
		}
		 
		for(String key:map.keySet()){
			list[map.get(key)].addLast(key);
		}
		   
		String[][] result = new String[map.size()][2];
		int j=0;
		for(int i=list.length-1;i>0;i--){
			LinkedList<String> temp = list[i];
			Iterator<String> it = temp.iterator();
			while(it.hasNext()){
				result[j][0] =new String(it.next());
				result[j][1] =String.valueOf(i);
				j++;
			}
		}
		return result;
	  }
	 
	 
	 public static String helper(String str){
		 StringBuffer strBuffer = new StringBuffer();
		 for(int i=0;i<str.length();i++){
			 int ascii = str.charAt(i);
			 
			   if((ascii >=65 && ascii<90) || ascii >=97 && ascii <123)
	            {
				   strBuffer.append(str.charAt(i));
	            }
		 }
		 
		 return strBuffer.toString();
	 }
	  
	 public static void main(String[] args) {

		  String input =  "      Every book is a quotation; and every house is a quotation out of all forests, and mines, and stone quarries; and every man is a quotation from all his ancestors. ";
		 String[][] result = wordCountEngine(input);
		 printResult(result);
	  }

	 public static void printResult(String[][] result){
		 for(String[] str: result){
			 System.out.println(str[0] + " "+ str[1]);
		 }
	 }
	
	 
	/* [ ["practice", "3"], ["perfect", "2"],
       ["makes", "1"], ["youll", "1"], ["only", "1"], 
       ["get", "1"], ["by", "1"], ["just", "1"] ]*/
}
