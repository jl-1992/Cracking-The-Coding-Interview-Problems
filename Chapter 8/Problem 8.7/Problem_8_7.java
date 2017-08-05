import java.util.*;

public class Problem_8_7{

	public ArrayList<String> perm(String s){
		if(s==null)
			return null;
		ArrayList<String> arr = new ArrayList<String>();
		if(s.length()==0){
			arr.add("");
			return arr;
		}
		arr=perm(s.substring(1));
		char c = s.charAt(0);
		String b=Character.toString(c);
		ArrayList<String> res = new ArrayList<String>();
		for(String t : arr){
			for(int i=0;i<=t.length();++i){
				String word = t.substring(0,i) + b + t.substring(i);
				res.add(word);
			}
		}

		return res;
	}

	public static void main(String[] args){
		Problem_8_7 p = new Problem_8_7();
		ArrayList<String> a = p.perm("abc");
		for(String s:a)
			System.out.println(s);
		System.out.println(a.size());
	}
}