import java.util.*;

public class Problem_4_3{

	public ArrayList<LinkedList<Node>> Depth_list(Node n){
		LinkedList<Node> list = new LinkedList<Node>();
		LinkedList<Node> list_2 = new LinkedList<Node>();
		ArrayList<LinkedList<Node>> arr = new ArrayList<LinkedList<Node>>();

		list.add(n);
		arr.add(list);
		System.out.println(list);
		while(!list.isEmpty()){
			Node temp = list.remove();
			if(temp.left!=null)
				list_2.add(temp.left);
			if(temp.right!=null) 
				list_2.add(temp.right);
			if(list.size()==0 && list_2.size()!=0){
				arr.add(list_2);
				System.out.println(list_2);
				list= new LinkedList<Node>(list_2);
				list_2.clear();
			}
		}
		return arr;
	}

	public static void main(String[] args){

	Problem_4_3 p = new Problem_4_3();

	Node a = new Node(null,null,39);
	Node b = new Node(null,null,9);
	Node c = new Node(null,null,4);
	Node d = new Node(null,a,23);
	Node e = new Node(null,null,14);
	Node f = new Node(b,c,103);
	Node g = new Node(null,null,-3);
	Node h = new Node(d,e,6);
	Node i = new Node(null,null,71);
	Node j = new Node(g,f,11);
	Node k = new Node(h,i,3);
	Node l = new Node(null,j,5);
	Node m = new Node(k,l,2);

	ArrayList<LinkedList<Node>> ans = p.Depth_list(m);

	}

}