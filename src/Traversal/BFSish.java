package Traversal;

import java.util.ArrayList;
import java.util.List;

import GraphNode.Node;

public class BFSish {
	private static List<Node> nodeList = new ArrayList<Node>();
	
	public static ArrayList<String> traverseAllNodes(Node startNode){
		ArrayList<String> vistedList = new ArrayList<String>();
		
		nodeList.add(startNode);
		
		while(nodeList.size() > 0){
			Node currentNode = nodeList.get(0);
			vistedList.add(currentNode.getData());
			
			for(Node curChild : currentNode.getChildrenList()){
				if(!vistedList.contains(curChild.getData())){
					nodeList.add(curChild);
				}
			}
			
			nodeList.remove(0);
		}
		
		return vistedList;
	}

}
