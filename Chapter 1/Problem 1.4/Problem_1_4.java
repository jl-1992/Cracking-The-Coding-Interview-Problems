import java.util.*;

public class Problem_1_4{
	
	public boolean isPermutation(String s){
		if(s.length()%2==0 || s.length()<3)
			return false;

		char[] c = s.toCharArray();
		int count=0;
		Arrays.sort(c);
		HashSet<Character> h = new HashSet<Character>();
		for(int i=0;i<c.length;++i){
			if(h.add(c[i])==false)
				++count;
		}
		if(count==(c.length-1)/2)
			return true;
		if(count==c.length-2 && h.size()==2)
			return true;
		return false;
	}

	public static void main(String[] args){
		Problem_1_4 p = new Problem_1_4();
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("acocatt");
		arr.add("ab");
		arr.add("aba");
		arr.add("ababa");
		arr.add("abcd");
		arr.add("abcdcba");
		arr.add("a a");
		for(String s : arr)
			System.out.println(p.isPermutation(s));
	}
}