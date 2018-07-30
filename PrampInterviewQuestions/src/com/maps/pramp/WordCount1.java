package com.maps.pramp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Data implements Comparable<Data>{

	int count;
	String word;
	
	public Data(String word,int count){
		this.word =word;
		this.count =count;
	}
	
	@Override
	public int compareTo(Data data) {
		return data.count-this.count;
	}
	
	 
}

public class WordCount1 {


	 static String[][] wordCountEngine(String document) {
		  
		 String[] wordList = document.toLowerCase().split(" ");
		 Map<String,Integer> map = new HashMap<String,Integer>();
		 
		 List<Data> dataList = new ArrayList<Data>();
		 for(String str:wordList){
			 String result = helper(str);
			 if(map.containsKey(result)){
				 map.put(result, map.get(result)+1);
			 }else{
				 map.put(result, 1);
			 }
		 }
		 
		 for(String key:map.keySet()){
			 dataList.add(new Data(key,map.get(key)));
		 }
		 
		 Collections.sort(dataList);
		 return null;
	  }
	 
	 
	 public static String helper(String str){
		 
		 ArrayList<Character> word = new ArrayList<Character>();
		 for(int i=0;i<str.length();i++){
			 int ascii = str.charAt(i);
			 
			   if((ascii >=65 && ascii<90) || ascii >=97 && ascii <123)
	            {
				   word.add(str.charAt(i));
	            }
		 }
		 
		 return word.toString();
	 }
	  
	 public static void main(String[] args) {

		  String input = "Practice makes perfect. you'll only get Perfect by practice. just practice!";
		  wordCountEngine(input);
	  }

	}


