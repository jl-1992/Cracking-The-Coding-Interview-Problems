public class Problem_8_3{

	public int magicIndex(int[] a){
		return magicIndex(a, 0, a.length-1);
	}

	public int magicIndex(int[] a, int start, int end){
		int mid= (end+start)/2;
		if(a.length==0)
			return -1;
		if(a[mid]==mid)
			return mid;
		if(a[mid]>mid)
			return magicIndex(a,start,mid);
		else
			return magicIndex(a,mid,end);
		}

	public static void main(String[] args){
		Problem_8_3 p = new Problem_8_3();
		int arr[] = {-40,-20,-1,1,2,3,4,7,9,12,13};
		System.out.println(p.magicIndex(arr));
	}
}