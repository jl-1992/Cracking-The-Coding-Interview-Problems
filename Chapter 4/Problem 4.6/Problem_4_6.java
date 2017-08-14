public class Problem_4_6{

	public Node find_next(Node n){
		if(n.left==null && n.right==null)
			return n;
		else if(n.left==null)
			return n.right;
		else
			return n.left;
	}

	public void iot(Node n){
		if(n!=null){
			iot(n.left);
			System.out.println(n.data);
			iot(n.right);
		}
	}


	public static void main(String[] args){
		Problem_4_6 p = new Problem_4_6();

		Node a = new Node(3,null,null);
		Node b = new Node(7,null,null);
		Node c = new Node(17,null,null);
		Node d = new Node(5,a,b);
		Node e = new Node(15,null,c);
		Node f = new Node(10,d,e);
		Node g = new Node(30,null,null);
		Node h = new Node(20,f,g);

		//p.iot(h);

		Node i = p.find_next(a);
		System.out.println(i.data);
	}
}