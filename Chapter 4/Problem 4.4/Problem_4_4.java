import java.lang.Math;

public class Problem_4_4{

	public boolean checkBalance(Node n){
		if(n!=null){
			checkBalance(n.left);
			checkBalance(n.right);
			if(n.left==null && n.right==null)
				return false;
			if(n.left==null){
				n.height+=n.right.height+1;
				return false;
			}
			if(n.right==null){
				n.height+=n.left.height+1;
				return false;
			}
			if(n.left.height!=n.right.height){
				return false;
			}
			else{
				return true;
			}
		}

		return false;
	}


	
	public static void main(String[] args){
		Problem_4_4 p = new Problem_4_4();

		Node h = new Node(null,null,6);
		Node i = new Node(null,null,71);
		Node k = new Node(h,i,3);
		Node l = new Node(null,null,5);
		Node m = new Node(k,l,2);

		System.out.println(p.checkBalance(m));
	}
}