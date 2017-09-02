public class Node{
	public int data;
	public Node left=null;
	public Node right=null;
	public int height=0;

	public Node(Node left, Node right, int data)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
}