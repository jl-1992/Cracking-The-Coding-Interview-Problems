public class Problem_8_5{
	public static int mult(int a, int b){
		if(b==0)
			return 0;
		else
			return a + mult(a,b-1);
	}

	public static void main(String[] args){
		System.out.println(mult(10,20));
	}
}