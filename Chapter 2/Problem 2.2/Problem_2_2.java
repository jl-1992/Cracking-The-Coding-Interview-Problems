public class Problem_2_2{
	
	public int kth_to_last(Node n, int k){
		int length=0;
		Node temp=n;
		while(temp.next!=null){
			++length;
			temp=temp.next;
		}
		if(k>=length)
			return -1;
		for(int count=1; count!=length-k+1;n=n.next,++count){}
		return n.data;
	}

	public static void main(String[] args){
		Problem_2_2 p = new Problem_2_2();
		Node a = new Node(5,null);
		Node b = new Node(4,a);
		Node c = new Node(3,b);
		Node d = new Node(2,c);
		Node e = new Node(1,d);
		System.out.println(p.kth_to_last(e,0));

	}

}