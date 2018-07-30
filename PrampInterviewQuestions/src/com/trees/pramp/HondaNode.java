package com.trees.pramp;

public class HondaNode {
		int cost;
		HondaNode[] children;
		HondaNode parent;

	    public HondaNode(int cost, int size) {
	      this.cost = cost;
	      children = new HondaNode[size];
	      parent = null;
	    }
	  
}
