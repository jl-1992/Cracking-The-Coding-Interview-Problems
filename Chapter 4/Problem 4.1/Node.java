public class Node{
	public int data;
	public Node[] children = new Node[10];
	public boolean visited=false;

	public Node(int data)
	{
		this.data=data;
	}
}