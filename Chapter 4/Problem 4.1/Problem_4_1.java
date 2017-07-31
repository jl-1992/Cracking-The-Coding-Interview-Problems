public class Problem_4_1{
	public static void main(String[] args)
	{	
		//Node values
		Node a = new Node(0);
		Node b = new Node(1);
		Node c = new Node(2);
		Node d = new Node(3);
		Node e = new Node(4);
		Node f = new Node(5);
		Node z = new Node(7);

		//Node edges
		a.children[0]=b;
		a.children[1]=e;
		a.children[2]=f;
		b.children[0]=d;
		b.children[1]=e;
		c.children[0]=b;
		c.children[1]=z;
		d.children[0]=c;
		d.children[1]=e;

		Graph g = new Graph();
		g.nodes[0]=a;
		g.nodes[1]=b;
		g.nodes[2]=c;
		g.nodes[3]=d;
		g.nodes[4]=e;
		g.nodes[5]=f;
		g.nodes[6]=z;

		System.out.println(g.route(g,a,z));


	}
}