import java.lang.Math;

public class Problem_2_5{
	
	public Node sumLists(Node a, Node b){
		int count=0;
		int rem=0;
		Node ans=null;
		Node temp=null;
		if(a.length()>b.length()){
			int diff=a.length()-b.length();
			for(int i=0; i<diff; ++i){
				b.add(0);
			}
		}
		if(a.length()<b.length()){
			int diff=b.length()-a.length();
			for(int i=0; i<diff; ++i){
				a.add(0);
			}
		}
		for(Node temp_a=a, temp_b=b; temp_a!=null && temp_b!=null; temp_a=temp_a.next,temp_b=temp_b.next){	
			int sum = (temp_a.data+temp_b.data);
			if(count==0){
				ans=new Node((sum%10),null);
				temp=ans;
			}
			else{
				ans.next=new Node((sum%10)+rem,null);
				ans=ans.next;
			}
			if(sum>=10)
				rem=1;
			else{
				rem=0;
			}
			++count;
		}

		if(rem==1)
			ans.add(1);

		return temp;
		
	}

	public void printList(Node n){
		while(n!=null){
			if(n.next!=null)
				System.out.print(n.data + "->");
			else
				System.out.println(n.data);
			n=n.next;
		}
	}

	public static void main(String[] args){
		Problem_2_5 p = new Problem_2_5();

		Node a = new Node(1,null);
		Node b = new Node(2,a);
		Node c = new Node(3,b);

		Node d = new Node(4,null);
		Node e = new Node(5,d);

		p.printList(c);
		System.out.println("plus");
		p.printList(e);
		System.out.println("equals");
		p.printList(p.sumLists(c,e));
	}

}