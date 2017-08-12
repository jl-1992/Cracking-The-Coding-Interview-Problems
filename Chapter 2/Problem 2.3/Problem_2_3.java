public class Problem_2_3{
	
	public void deleteNode(Node n){
			n.data=n.next.data;
			n.next=n.next.next;
	}

	public static void main(String[]args){
		Problem_2_3 p = new Problem_2_3();
		Node a = new Node(5,null);
		Node b = new Node(4,a);
		Node c = new Node(3,b);
		Node d = new Node(2,c);
		Node e = new Node(1,d);

		p.deleteNode(c);

		Node temp=e;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}

	}
}