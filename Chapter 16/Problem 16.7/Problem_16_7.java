public class Problem_16_7{

	public static int findMax(int a, int b){
		int c = ((a-b)>>31) + 1;
		return c*a + (1-c)*b;
	}
	
	public static void main(String[] args){
		System.out.println(findMax(-12,-11));
	}
}