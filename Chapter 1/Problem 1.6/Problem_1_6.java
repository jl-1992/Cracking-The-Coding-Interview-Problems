public class Problem_1_6{
	
	public String compress(String s){
		String ans = "";
		for(int i=0; i<s.length();++i){
			int count=1;
			while(i!=s.length()-1 && s.charAt(i)==s.charAt(i+1)){
				++count;
				++i;
			}
			ans+=s.charAt(i)+Integer.toString(count);
		}
		if(ans.length()<s.length())
			return ans;
		return s;
	}

	public static void main(String[] args){
		Problem_1_6 p = new Problem_1_6();
		System.out.println(p.compress("abcdef"));
	}
}