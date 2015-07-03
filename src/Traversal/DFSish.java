package Traversal;

import java.util.ArrayList;
import java.util.Stack;

import GraphNode.Node;

public class DFSish {
	private static Stack<Node> nodeStack = new Stack<Node>();
	
	public static ArrayList<String> traverseAllNodes(Node startNode){
		ArrayList<String> visitedList = new ArrayList<String>();
		
		nodeStack.push(startNode);
		
		Node current = startNode;
		
		while(!nodeStack.isEmpty()){			
			visitedList.add(current.getData());
			
			for(Node curChild : current.getChildrenList()){				
				if(!visitedList.contains(curChild.getData())){
					nodeStack.push(curChild);
				}
			}
			
			current = nodeStack.pop();
		}
		
		
		return visitedList;
	}
}
