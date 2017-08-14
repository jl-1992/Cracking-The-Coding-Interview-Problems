import java.util.*;

public class Problem_4_12{

	public int num_sum_paths(Node n, int target){
		int sum=0;
		int num_paths=0;
		return num_sum_paths(n,sum,target, num_paths);
	}

	public int num_sum_paths(Node n, int sum, int target, int num_paths){
		if(n!=null){
			if(n.left!=null && n.visited==false){
				n.visited = true;
				sum+=n.data;
				//System.out.println(sum);
				if(sum==target)
					++num_paths;
				num_paths=num_sum_paths(n.left,sum,target,num_paths);
			}
			if(n.left!=null && n.visited==true && n.left.visited==false){
				num_paths=num_sum_paths(n.left,sum,target,num_paths);
			}
			if(n.right!=null && n.visited==false){
				n.visited = true;
				sum+=n.data;
				//System.out.println(sum);
				if(sum==target)
					++num_paths;
				num_paths=num_sum_paths(n.right,sum,target,num_paths);
			}
			if(n.right!=null && n.visited==true && n.right.visited==false){
				num_paths=num_sum_paths(n.right,sum,target,num_paths);
			}
			if(n.right==null && n.left==null){
				n.visited=true;
				sum+=n.data;
				//System.out.println(sum);
				if(sum==target)
					++num_paths;
			}
		}
		sum-=n.data;
		//System.out.println(sum);
		return num_paths;
	}
	
	public static void main(String[] args){
		Problem_4_12 p = new Problem_4_12();

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

		System.out.println(p.num_sum_paths(m,11));
	}
}