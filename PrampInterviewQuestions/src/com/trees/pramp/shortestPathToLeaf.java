package com.trees.pramp;

public class shortestPathToLeaf {
	
	Node root;
	static int minPath = Integer.MAX_VALUE;
	
	  public static void main(String args[])
	    {
		  	shortestPathToLeaf tree = new shortestPathToLeaf();
	        tree.root = new Node(0);
	        tree.root.left = new Node(1);
	        tree.root.right = new Node(2);
	        
	        tree.root.left.left = new Node(3);
	        tree.root.left.right = new Node(4);
	        
	        tree.root.left.left.left = new Node(7);
	        tree.root.left.left.right = new Node(8);
	        
	     
	        tree.root.left.right.left = new Node(9);
	        tree.root.left.right.right = new Node(10);
	        
	        tree.root.right.left = new Node(5);
	        tree.root.right.right = new Node(6);
	        
	        tree.root.right.left.left =new Node(11);
	        tree.root.right.left.right =new Node(12);
	        
	        tree.root.right.right.right = new Node(13);
	 
	        System.out.println("The minimum depth of "+
	          "binary tree is : " + tree.minimumDepthPostOrder(tree.root));
	    }

	  public static int minimumDepth(Node node, int sum){
		  
		  if(node== null){
			  return 0;
		  }
		  
		  if(node.left ==null && node.right ==null){
			  sum+=node.data;
			  if(sum<minPath){
				  minPath = sum;
			  }
		  }
		  minimumDepth(node.left,node.data+sum);
		  minimumDepth(node.right,node.data+sum);
		  return minPath;
	  }
	  
	 public static int minimumDepthPostOrder(Node node){
		 
		 if(node ==null){
			 return 0;
		 }else{
			 return minimumDepth1(node);
		 }
	 }
	  

	  public static int minimumDepth1(Node node){
		  
		  if(node== null){
			  return Integer.MAX_VALUE;
		  }
		  
		  if(node.left == null && node.right==null){
			  return node.data;
		  }
		
		  int minLeft  =minimumDepth1(node.left);
		  int minRight =minimumDepth1(node.right);
		  return Math.min(minLeft, minRight) + node.data;
	  }
}
