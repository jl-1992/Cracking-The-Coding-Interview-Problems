import java.util.*;

public class Problem_8_1{

	public int tripleStep(int n){
		int[] memo = new int[n+1];
		Arrays.fill(memo,-1);
		return tripleStep(n, memo);
	}

	public int tripleStep(int n, int[] memo){
		if(n<0)
			return 0;
		else if(n==0)
			return 1;
		else if(memo[n]>-1)
			return memo[n];
		else{
			memo[n]=tripleStep(n-1, memo)+tripleStep(n-2,memo)+tripleStep(n-3,memo);
			return memo[n];
		}
	}

	public static void main(String[] args){
		Problem_8_1 p = new Problem_8_1();
		System.out.println(p.tripleStep(3));
	}
}