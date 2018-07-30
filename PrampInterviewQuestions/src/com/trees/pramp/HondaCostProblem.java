package com.trees.pramp;

public class HondaCostProblem {

	public static void main(String[] args){
	
		HondaNode node = new HondaNode(0,3);
		node.children[0] = new HondaNode(5,1);
		node.children[0].children[0] = new HondaNode(4,0);
		
		node.children[1] = new HondaNode(3,2);
		node.children[1].children[0] = new HondaNode(2,1);
		node.children[1].children[0].children[0] = new HondaNode(1,1);
		node.children[1].children[0].children[0].children[0] = new HondaNode(1,0);
		
		node.children[1].children[1] = new HondaNode(0,1);
		node.children[1].children[1].children[0] = new HondaNode(10,0);
		
		node.children[2] = new HondaNode(6,2);
		node.children[2].children[0] = new HondaNode(1,0);
		node.children[2].children[1] = new HondaNode(5,0);
		
		System.out.println("********" + shortestPath(node));
		
	}
	
	public static int shortestPath(HondaNode node){
		
		if(node == null){
			return 0;
		}
		if(node.children == null || node.children.length==0){
			return node.cost;
		}
		
		return shortestPath1(node);
	}
	
	public static int shortestPath1(HondaNode node){
		
		if(node== null){
			return Integer.MAX_VALUE;
		}
		
		if(node.children == null || node.children.length==0){
			return node.cost;
		}
		
		int min =Integer.MAX_VALUE;
		for(HondaNode n: node.children){
			int value = shortestPath1(n);
			if(value<min){
				min = value;
			}
		}
		
		return min+node.cost;
	}
}
