package misc;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class WordCountEngine {
	
	public static void main(String[] args){
		 
		
	
		String text = "abaa" ; String pattern = "a.*a*";
		boolean isMatching = isMatching(text, pattern);
		System.out.println(isMatching);
		
	}
	
	public static boolean isMatching(String text, String pattern){
		
		boolean[][] a = new boolean[text.length()+1][pattern.length()+1];
		
		a[0][0] =true; 
		for(int i=1; i<pattern.length();i++){
			a[0][i]= false;
		}
		
		for(int i=1;i<=text.length();i++){
			for(int j=0;j<=pattern.length();j++){
				if(j==0){
					a[i][j]= false;
					continue;
				}
				
				if(text.charAt(i-1) == pattern.charAt(j-1) || pattern.charAt(j-1)=='.' ){
					a[i][j] = a[i-1][j-1];
				}else if(pattern.charAt(j-1) == '*'){
					
					if(a[i][j-2]){
						a[i][j] = a[i][j-2];
					}else if(pattern.charAt(j-2) == '.' || pattern.charAt(j-2) == text.charAt(i-1)){
						a[i][j] = a[i-1][j];
					}
				}else if(text.charAt(i-1) != pattern.charAt(j-1)){
					a[i][j] = false;
				}
				
			}
		}
		
		return a[a.length-1][a[0].length-1];
	}
}
