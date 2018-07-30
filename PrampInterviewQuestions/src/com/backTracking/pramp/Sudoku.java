package com.backTracking.pramp;

import java.util.HashSet;

public class Sudoku {

	  static boolean sudokuSolve(char[][] board) {
	    return solve(board);
	}
	 
	public static boolean solve(char[][] board){
	    for(int i=0; i<9; i++){
	        for(int j=0; j<9; j++){
	            if(board[i][j]!='.')
	                continue;
	 
	            for(int k=1; k<=9; k++){
	                board[i][j] = (char) (k+'0');
	                if(isValid(board, i, j) && solve(board))
	                    return true;
	                board[i][j] = '.';    
	            }
	 
	            return false;
	        }
	    }
	 
	    return true; // does not matter
	}

	public static boolean isValid(char[][] board, int i, int j){
	    HashSet<Character> set = new HashSet<Character>();
	 
	    for(int k=0; k<9; k++){
	        if(set.contains(board[i][k]))
	            return false;
	 
	        if(board[i][k]!='.' ){
	            set.add(board[i][k]);
	        }
	    }
	 
	    set.clear();
	 
	    for(int k=0; k<9; k++){
	        if(set.contains(board[k][j]))
	            return false;
	 
	        if(board[k][j]!='.' ){
	            set.add(board[k][j]);
	        }
	    }
	 
	    set.clear();
	 
	    for(int m=0; m<3; m++){
	        for(int n=0; n<3; n++){
	            int x=i/3*3+m;
	            int y=j/3*3+n;
	            if(set.contains(board[x][y]))
	                return false;
	 
	            if(board[x][y]!='.'){
	                set.add(board[x][y]);
	            }    
	        }
	    }
	 
	    return true;
	}
	 
	/* Driver Program to test above functions */
	public static void main(String[] args)
	{
	    // 0 means unassigned cells
	    char[][] grid =   {{'.','.','5','.','.','2','.','.','.'},
	    		           {'.','.','9','.','4','7','.','2','.'},
	    		           {'.','.','8','.','5','6','.','.','1'},
	    		           {'.','.','.','.','.','8','3','4','.'},
	    		           {'.','.','.','.','.','.','.','.','6'},
	    		           {'.','.','.','.','3','.','1','8','.'},
	    		           {'.','2','.','.','.','.','.','.','.'},
	    		           {'.','9','.','.','8','.','6','7','.'},
	    		           {'3','.','6','5','7','.','.','.','.'}};
	    if (sudokuSolve(grid) == true)
	    	System.out.println("solution exists");
	    else
	    	System.out.println("No solution exists");
	 
	   
	}
}
