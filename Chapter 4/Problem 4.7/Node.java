import java.util.ArrayList;

public class Node{
	
	String data;
	ArrayList<Node> parentNodes = new ArrayList<Node>();
	int children=0;
	int parents=0;

	public Node(String data){
		this.data=data;
	}

	public void add(Node n){
		parentNodes.add(n);
	}
}