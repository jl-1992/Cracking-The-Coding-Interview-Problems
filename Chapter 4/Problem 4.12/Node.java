public class Node{
	public int data;
	public Node left=null;
	public Node right=null;
	boolean visited=false;

	public Node(Node left, Node right, int data)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
}