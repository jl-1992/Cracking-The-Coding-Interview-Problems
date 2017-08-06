public class Problem_10_3{
	
	public int find(int [] arr, int target){
		int start = 0;
		int end = arr.length-1;
		return find(arr,target,start,end); 
	}

	public int find(int [] arr, int target, int start, int end){
		if(start>end)
			return -1;
		int mid = (start+end)/2;
		boolean right_sorted=true;
		if(arr[mid]>arr[end])
			right_sorted=false;
		if(arr[mid]==target)
			return mid;
		else if(arr[mid]<target && right_sorted && arr[end]>target)
			return find(arr,target,mid+1,end);
		else if(arr[mid]>target && right_sorted && arr[end]<target)
			return find(arr,target,start,mid-1);
		else if(arr[mid]<target && !right_sorted)
			return find(arr,target,mid+1,end);
		else
			return find(arr,target,start,mid-1);
	}

	public static void main(String[] args){
		Problem_10_3 p = new Problem_10_3();
		int [] a = {15,16,17,20,25,1,3,4,10,11,12,14};
		System.out.println(p.find(a,2));
	}
}