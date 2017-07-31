public class Problem_4_5{

	public boolean flag = true;

	public boolean valBST(Node n)
	{
		if(n.left!=null)
			if(n.left.data<n.data)
				valBST(n.left);
			else{
				flag=false;
				return flag;
			}
		if(n.right!=null)
			if(n.right.data>n.data)
				valBST(n.right);
			else{
				flag=false;
				return flag;
			}

		return flag;
	}
	
	public static void main(String[] args)
	{
		Node a = new Node(3,null,null);
		Node b = new Node(7,null,null);
		Node c = new Node(17,null,null);
		Node d = new Node(5,a,b);
		Node e = new Node(15,null,c);
		Node f = new Node(10,d,e);
		Node g = new Node(30,null,null);
		Node h = new Node(20,f,g);

		Problem_4_5 z = new Problem_4_5();
		System.out.println(z.valBST(h));
	}
}