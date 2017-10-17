import java.util.*;

public class Problem_16_16{

	public static Pair subSort(int[] arr){
		Pair ans = new Pair(0,0);
		int max = arr[0];
		ArrayList<Integer> a = new ArrayList<Integer>();

		for(int i=0; i<arr.length-1; i++){
			if(arr[i]>=max){
				max=arr[i];
			}
			else{
				a.add(i);
			}
		}

		int min = Collections.min(a);

		for(int i=0; i<arr.length; i++){
			if(min<arr[i]){
				ans.x=i;
				break;
			}
		}
		ans.y = a.get(a.size()-1);

		return ans;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,4,7,10,11,5,12,6,7,16,18,19};
		Pair p = subSort(arr);
		System.out.println(p.toString());
	}
}