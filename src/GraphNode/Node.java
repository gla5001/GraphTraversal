package GraphNode;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private String data; //unique to each node
	private List<Node> children = new ArrayList<Node>();
	
	public Node(String dataIn){
		this.data = dataIn;
	}
	
	public void addChildToList(Node childIn){
		this.children.add(childIn);
	}
	
	public void removeChildFromList(Node childIn){
		int index = 0;
		
		for(Node node : this.children){
			if(node.data.equals(childIn.data)){
				this.children.remove(index);
			}
			index++;
		}
	}
	
	public String getData(){
		return this.data;
	}
	
	public List<Node> getChildrenList(){
		return this.children;
	}
}
