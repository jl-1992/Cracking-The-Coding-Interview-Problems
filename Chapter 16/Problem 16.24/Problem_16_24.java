import java.util.ArrayList;

public class Problem_16_24{

	public static ArrayList<Pair> pairsWithSum(int[] arr, int sum){
		ArrayList<Pair> res = new ArrayList<Pair>();

		for(int i=0; i<arr.length-1; i++){
			int pivot=arr[i];
			for(int j=i+1; j<arr.length; j++){
				if(pivot+arr[j]==sum)
					res.add(new Pair(pivot,arr[j]));
			}
		}

		return res;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		ArrayList<Pair> list = pairsWithSum(arr,5);

		for(Pair p: list)
			System.out.println(p.toString());
	}
}