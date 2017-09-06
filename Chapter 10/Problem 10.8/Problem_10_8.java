import java.util.*;

public class Problem_10_8{
	//Since only 4000 bytes of memory is allowed and there are at most
	//32000 checks that need to be made, we can use a bit vector.

	public void findDuplicates(int[] arr){
		BitSet b = new BitSet(4000);
		for(int i=0;i<arr.length;i++){
			if(b.get(arr[i])){
				b.clear(arr[i]);
				System.out.println(arr[i]);
			}
			else{
				b.flip(arr[i]);
			}
		}
	}

	public static void main(String[] args){
		Problem_10_8 p = new Problem_10_8();
		int[] arr = {1,2,3,4,4,6,7,7,8,9,10,11,12,13,
			14,15,16,17,17,18,19,19,20,21,21,21,22};
		p.findDuplicates(arr);
	}
}