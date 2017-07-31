public class Problem_4_2{

	public Node arrToTree(int[] n)
	{
		return arrToTree(n, 0, array.length-1);
	}

	public Node arrToTree(int[] n, int start, int end)
	{
		if(end>start)
			return null;
		int mid = (start+end)/2
		Node root = new Node(n[mid]);
		root.left=arrToTree(n,start,mid-1);
		root.right=arrToTree(n,mid+1,end);
		return root;
	}

	public static void main(String[] args)
	{
		int[] a = new int[9];
		a[0]=0;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		a[5]=5;
		a[6]=6;
		a[7]=7;
		a[8]=8;

	}
}