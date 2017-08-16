public class Problem_10_5_faster{

	public int sparse_search(String s, String[] arr){
		int start=0;
		int end=arr.length-1;
		return sparse_search(s,arr,start,end);
	}

	public int sparse_search(String s, String[] arr, int start, int end){
		int mid = (start+end)/2;
		if(start>end)
			return -1;
		if(arr[mid]=="")
			while(arr[mid]=="")
				++mid;
		else if(arr[mid].compareTo(s)>0)
			return sparse_search(s,arr,0,mid-1);
		else if(arr[mid].compareTo(s)<0)
			return sparse_search(s,arr,mid+1,end);
		return mid;
	}
	
	public static void main(String[] args){
		Problem_10_5 p = new Problem_10_5();
		String[] arr = {"at", "", "", "", "ball", "", "","car","","","dad","",""};
		System.out.println(p.sparse_search("ball",arr));
	}
}