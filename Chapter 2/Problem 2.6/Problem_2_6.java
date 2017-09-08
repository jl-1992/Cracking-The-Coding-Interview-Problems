import java.util.*;

public class Problem_2_6{

	public boolean isPalindrome(Node n){
		int len=0, count=0;
		String temp = "";
		BitSet b = new BitSet(128);
		HashMap<Character,Boolean> h = new HashMap<Character,Boolean>();

		while(n!=null){
			++len;
			b.flip(Character.getNumericValue(n.data));
			h.put(n.data,b.get(Character.getNumericValue(n.data)));
			if(h.get(n.data)){
				++count;
			}
			else{
				--count;
			}
			temp+=Character.toString(n.data);
			n=n.next;
		}

		if(len%2==0)
			return false;

		int mid = len/2;

		return h.get(temp.charAt(mid)) && count==1;

	}
	
	public static void main(String[] args){
		Problem_2_6 p = new Problem_2_6();

		Node a = new Node('r',null);
		Node b = new Node('a',a);
		Node c = new Node('c',b);
		Node d = new Node('e',c);
		Node e = new Node('c',d);
		Node f = new Node('a',e);
		Node g = new Node('r',f);


		System.out.println(p.isPalindrome(g));
	}	
}