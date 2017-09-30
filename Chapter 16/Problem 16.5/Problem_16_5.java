public class Problem_16_5{

	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		return n*(factorial(n-1));
	}

	public static int trails(int n){
		int count=0;
		while(n%10==0){
			++count;
			n/=10;
		}

		return count;
	}
	

	public static void main(String[] args){
		System.out.println(trails(factorial(10)));
	}
}