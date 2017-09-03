import java.util.*;

public class Problem_8_8{

	HashSet<String> h = new HashSet<String>();
	ArrayList<String> rem = new ArrayList<String>();


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
				if(h.add(word)==false)
					rem.add(word);
			}
		}

		for(String q : rem){
			res.remove(q);
		}

		return res;
	}

	public static void main(String[] args){
		Problem_8_8 p = new Problem_8_8();
		ArrayList<String> a = p.perm("abb");
		for(String s:a)
			System.out.println(s);
		System.out.println(a.size());
	}
}