import java.util.*;

public class Problem_2_8{

	HashMap<Character,Node> h = new HashMap<Character,Node>();

	public Node loopDetect(Node n){
		while(n!=null){
			if(h.put(n.data,n.next)!=null){
				return n;
			}
			n=n.next;
		}

		return n;
	}	
}