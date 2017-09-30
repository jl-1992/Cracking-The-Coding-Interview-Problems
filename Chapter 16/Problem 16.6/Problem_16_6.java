import java.lang.Math;

public class Problem_16_6{

	public static Pair smol_dif(int[] a, int[] b){
		int min=Integer.MAX_VALUE;
		Pair p = new Pair(0,0);

		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(Math.abs(a[i]-b[j])<min){
					min=Math.abs(a[i]-b[j]);
					p.x=a[i];
					p.y=b[j];
				}
			}
		}

		return p;
	}

	public static void main(String[] args){

		int[] a = {1,3,15,11,2};
		int[] b = {23,127,235,19,8};

		Pair pair = smol_dif(a,b);
		pair.print();
	}
}