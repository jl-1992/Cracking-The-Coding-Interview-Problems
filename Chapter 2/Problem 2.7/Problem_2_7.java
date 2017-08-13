import java.util.*;

public class Problem_2_7{

	public Node intersect(Node m, Node n){
		int len_m=0;
		int len_n=0;

		for(Node temp = m; temp!=null; temp=temp.next)
			++len_m;

		for(Node temp = n; temp!=null; temp=temp.next)
			++len_n;

		int count;

		if(len_m>len_n){
			count=len_m-len_n;
			for(int i=0; i<count; ++i)
				m=m.next;
		}
		else{
			count=len_n-len_m;
			for(int i=0; i<count; ++i)
				n=n.next;
		}


		Node temp_beg=null;
		Node temp_end=null;
		while(m!=null && n!=null){
			Node m_next=m.next;
			Node n_next=n.next;
			if(m==n){
				m.next=null;
				n.next=null;
				if(temp_beg==null){
					temp_beg=m;
					temp_end=temp_beg;
				}
				else{
					temp_end.next=m;
					temp_end=m;
				}
			}
			m=m_next;
			n=n_next;
		}

		return temp_beg;
	}
	
	public static void main(String[] args){
		Problem_2_7 p = new Problem_2_7();

		Node a = new Node(1,null);
		Node b = new Node(2,a);
		Node c = new Node(7,b);
		Node d = new Node(9,c);
		Node e = new Node(5,d);
		Node f = new Node(1,e);
		Node g = new Node(3,f);

		Node h = a;
		Node i = b;
		Node j = c;
		Node k = new Node(6,j);
		Node l = new Node(4,k);

		Node ans = p.intersect(l,g);

		while(ans!=null){
			System.out.println(ans.data);
			ans=ans.next;
		}
	}

}