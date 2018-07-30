package com.graphs.pramp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NoOfIslands {
	
	static int getNumberOfIslandsIterative(int[][] binaryMatrix) {

		int count =0;
	
	    for(int i=0;i<binaryMatrix.length;i++){
	    	for(int j=0;j<binaryMatrix[0].length;j++){
	    		if(binaryMatrix[i][j]==1){
	    			count++;
	    			bfs(i,j,binaryMatrix);
	    		}
	    	}
	    }
	 return count;

	}
	
	public static void bfs(int i,int j, int[][] binaryMatrix){
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(i*binaryMatrix[0].length+j);
		
		while(!queue.isEmpty()){
			
			int value = queue.poll();
			int x = value/binaryMatrix[0].length;
			int y = value%binaryMatrix[0].length;
			if(binaryMatrix[x][y] ==1){
				
				binaryMatrix[x][y] =-1;
					pushIfValid((x+1),y,binaryMatrix,queue);
					pushIfValid((x-1),y,binaryMatrix,queue);
					pushIfValid(x,(y-1),binaryMatrix,queue);
					pushIfValid(x,(y+1),binaryMatrix,queue);
			}
		}
	}
	
	public static void pushIfValid(int a,int b, int[][]matrix, Queue<Integer> queue ){
		if(a<0 || b<0 || a>=matrix.length ||b>=matrix[0].length){
			return;
		}
		if(matrix[a][b]==1){
		
		queue.add(a*matrix[0].length+b);
		}	
	}
	
	
public static void dfs(int i,int j, int[][] binaryMatrix){
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(i*binaryMatrix[0].length+j);
		
		while(!stack.isEmpty()){
			
			int value = stack.pop();
			int x = value/binaryMatrix[0].length;
			int y = value%binaryMatrix[0].length;
			if(binaryMatrix[x][y] ==1){
				
				binaryMatrix[x][y] =-1;
					pushIfValid((x+1),y,binaryMatrix,stack);
					pushIfValid((x-1),y,binaryMatrix,stack);
					pushIfValid(x,(y-1),binaryMatrix,stack);
					pushIfValid(x,(y+1),binaryMatrix,stack);
			}
		}
	}

public static void pushIfValid(int a,int b, int[][]matrix, Stack<Integer> stack ){
	if(a<0 || b<0 || a>=matrix.length ||b>=matrix[0].length){
		return;
	}
	if(matrix[a][b]==1){
	
	stack.push(a*matrix[0].length+b);
	}	
}

static int getNumberOfIslandsRecursion(int[][] binaryMatrix) {

	int count =0;

    for(int i=0;i<binaryMatrix.length;i++){
    	for(int j=0;j<binaryMatrix[0].length;j++){
    		if(binaryMatrix[i][j]==1){
    			count++;
    			DFS(i,j,binaryMatrix);
    		}
    	}
    }
 return count;

}

public static void DFS(int a,int b, int[][] matrix){
	
	if(a<0 || b<0 || a>=matrix.length ||b>=matrix[0].length){
		return;
	}
	if(matrix[a][b]==1){
		matrix[a][b]=-2;
		DFS(a+1,b,matrix);
		DFS(a-1,b,matrix);
		DFS(a,b-1,matrix);
		DFS(a,b+1,matrix);
	}
}


	public static void main(String[] args) {

		int[][] a = {{1,0,1,0},{0,1,1,1},{0,0,1,0}};
		System.out.print("No Of Islands"+ getNumberOfIslandsIterative(a));
	}

}
