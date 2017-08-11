public class Problem_2_2_faster{
	
	public int kth_to_last(Node n, int k){
		int length=0;
		Node temp=n;
		while(temp.next!=null){
			++length;
			temp=temp.next;
			if(length>k)
				n=n.next;
		}
		if(k>=length)
			return -1;
		return n.data;
	}

	public static void main(String[] args){
		Problem_2_2_faster p = new Problem_2_2_faster();
		Node a = new Node(5,null);
		Node b = new Node(4,a);
		Node c = new Node(3,b);
		Node d = new Node(2,c);
		Node e = new Node(1,d);
		System.out.println(p.kth_to_last(e,7));

	}

}