public class Problem_2_4{


	public Node partition(Node n, int part){
		Node before_beg=null;
		Node after_beg=null;
		Node before_end=null;
		Node after_end=null;

		while(n!=null){
			Node next=n.next;
			n.next=null;
			if(n.data>=part){
				if(after_beg==null){
					after_beg=n;
					after_end=after_beg;
				}
				else{
					after_end.next=n;
					after_end=n;
				}
			}
			else{
				if(before_beg==null){
					before_beg=n;
					before_end=before_beg;
				}
				else{
					before_end.next=n;
					before_end=n;
				}
			}
			n=next;
		}
		if(before_beg==null)
			return after_beg;

		before_end.next=after_beg;
		return before_beg;
	}
	
	public static void main(String[] args){
		Problem_2_4 p = new Problem_2_4();

		Node a = new Node(1,null);
		Node b = new Node(2,a);
		Node c = new Node(10,b);
		Node d = new Node(5,c);
		Node e = new Node(8,d);
		Node f = new Node(5,e);
		Node g = new Node(3,f);

		Node h = p.partition(g,5);

		while(h!=null){
			System.out.println(h.data);
			h=h.next;
		}
	}
}