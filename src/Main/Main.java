package Main;

import java.util.List;

import GraphNode.Node;
import Traversal.DFSish;
import Traversal.BFSish;

public class Main {

	public static void main(String[] args) {
		//create graph with graph nodes
		Node child1 = new Node("A");
		
		Node child2 = new Node("B");
		child2.addChildToList(child1);
		
		Node child3 = new Node("C");
		Node child4 = new Node("D");
		child1.addChildToList(child3);
		child1.addChildToList(child4);		
		
		Node child5 = new Node("E");
		child4.addChildToList(child5);
		
		child5.addChildToList(child2);
		
		Node childSelf = new Node("Self");
		childSelf.addChildToList(childSelf);
		
		List<String> allNodesDFSish = DFSish.traverseAllNodes(childSelf);
		System.out.println(allNodesDFSish.toString());
		List<String> allNodesBFSish = BFSish.traverseAllNodes(childSelf);
		System.out.println(allNodesBFSish.toString());
		System.out.println("Done");

	}

}
