import java.util.*;

public class Problem_4_9{

	public ArrayList<Integer> bfs(Node n){
		Queue<Node> q = new LinkedList<Node>();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		q.add(n);

		while(!q.isEmpty()){
			Node temp = q.remove();
			arr.add(temp.data);
			if(temp.left!=null){
				q.add(temp.left);
			}
			if(temp.right!=null){
				q.add(temp.right);
			}
		}
		return arr;
	}

	/*public ArrayList findSequences(ArrayList<Integer> tree){
		
		the input of this function will be the returned 'arr' from bfs()

		First, we can convert that arraylist into an int[]
		In this case, we'd have {2,1,3,4,5,6,7}

		let a = {1,3}, b = {4,5}, and c = {6,7}
		let a' = {3,1}, b' = {5,4}, and c' = {7,6}

		Then this new int[] = {2,a,b,c}

		Thus, our permutations will be

		{2,a,b,c}
		{2,a',b,c}
		{2,a,b',c}
		{2,a,b,c'}
		{2,a',b',c}
		{2,a,b',c'}
		{2,a',b,c'}
		{2,a',b',c'}
	}*/
	
	public static void main(String[] args){
		Problem_4_9 p = new Problem_4_9();

		Node a = new Node(null,null,4);
		Node b = new Node(null,null,5);
		Node c = new Node(null,null,6);
		Node d = new Node(null,null,7);
		Node e = new Node(a,b,1);
		Node f = new Node(c,d,3);
		Node g = new Node(e,f,2);

		for(Integer i : p.bfs(g))
			System.out.println(i);

	}
}