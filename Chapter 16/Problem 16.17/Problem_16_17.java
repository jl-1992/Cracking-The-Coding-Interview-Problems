public class Problem_16_17{

	public static int sequence(int[] arr){
		int sum=Integer.MIN_VALUE;
		int newSum=0;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				newSum+=arr[j];
				if(newSum>sum)
					sum=newSum;
			}			
			newSum=0;
		}
		return sum;
	}
	
	public static void main(String[] args){
		int[] arr={2,-8,3,-2,4,-10};
		System.out.println(sequence(arr));
	}
}