import java.util.ArrayList;

public class Graph{

	ArrayList<Node> nodes = new ArrayList<Node>();

	public void add(Node n){
		nodes.add(n);
	}

	public Node get(int index){
		return nodes.get(index);
	}
}