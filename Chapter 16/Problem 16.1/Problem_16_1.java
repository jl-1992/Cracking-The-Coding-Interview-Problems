public class Problem_16_1{

	public int[] numberSwap(int[] arr){
		arr[1]-=arr[0];
		arr[0]+=arr[1];
		arr[1]=arr[0]-arr[1];

		return arr;
	}

	public static void main(String[] args){
		Problem_16_1 p = new Problem_16_1();
		int[] arr = {4,7};
		arr = p.numberSwap(arr);
		for(int i =0; i<arr.length;++i)
			System.out.println(arr[i]);
	}
}