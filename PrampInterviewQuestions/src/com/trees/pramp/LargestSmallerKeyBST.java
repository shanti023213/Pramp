package com.trees.pramp;


import java.io.*;
import java.util.*;


class LargestSmallerKeyBST {
 
  static class Node {
    int key;
    Node left;
    Node right; 
    Node parent;
    
    Node(int key) {
      this.key = key;
      left = null;
      right = null;
      parent = null;
    }
  }
  
  static class BinarySearchTree {
    
    Node root;
    
    int findLargestSmallerKeyIfGivenNumberNotPartOfTree(int num) {
        
        int result =-1;
        while(root!=null){
          if(root.key>num){
              root = root.left;
          }else{
            result = root.key;
            root =root.right;
          }
          
        }
        return  result;
      }
    
		int findLargestSmallerKey(int num) {

			if (root == null || root.key == num) {
				return -1;
			}

			if (root.key > num) {
				return findLargestSmallerUtility(root.left, num);
			}

			if (root.key < num) {
				return findLargestSmallerUtility(root.right, num);
			}

			return -1;
		}
    
 
    int findLargestSmallerUtility(Node n, int num){
    	
    	if(n==null){
    		return -1;
    	}
    	
    	if(n.key<num){
    			if(n.right==null){
    				return n.key;
    			}else{
    				return findLargestSmallerUtility(n.right,num);
    			}
    	}
    	
    	if(n.key>num){
			return -1;
    	}
    	
    	if(n.key==num){
    		while(n.right!=null){
    	           n=n.right;
    	    }
    	 return n==null?-1:n.key;
    	}
    	
    	
    	return -1;
    }
   
    
    //  inserts a new node with the given number in the
    //  correct place in the tree
    void insert(int key) {
      
      // 1) If the tree is empty, create the root
      if(this.root == null) {
        this.root = new Node(key);
        return;
      }
      
      // 2) Otherwise, create a node with the key
      //    and traverse down the tree to find where to
      //    to insert the new node
      Node currentNode = this.root;
      Node newNode = new Node(key); 
      
      while(currentNode != null) {
        if(key < currentNode.key) {
          if(currentNode.left == null) {
            currentNode.left = newNode;
            newNode.parent = currentNode;
            break;
          } else {
            currentNode = currentNode.left;
          }
        } else {
          if(currentNode.right == null) {
            currentNode.right = newNode;
            newNode.parent = currentNode;
            break;
          } else {
            currentNode = currentNode.right;
          }
        }
      }
    }
  }

  /*********************************************
   * Driver program to test above function     *
   *********************************************/ 
   
   public static void main(String[] args) {
     
     // Create a Binary Search Tree
     BinarySearchTree bst = new BinarySearchTree();
     bst.insert(20);
     bst.insert(9);
     bst.insert(25);
     bst.insert(5);
     bst.insert(12);
     bst.insert(11);
     bst.insert(14);
     
     int result = bst.findLargestSmallerKey(17);
     System.out.println("Largest smaller number is " + result);
    
  }
}