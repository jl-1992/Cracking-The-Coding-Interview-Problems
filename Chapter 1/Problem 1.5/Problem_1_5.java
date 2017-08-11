public class Problem_1_5{
	
	public boolean oneAway(String s, String t){
		int len_1 = s.length();
		int len_2 = t.length();
		String larger = s;
		String smaller = t;
		if(len_2>len_1){
			larger=t;
			smaller=s;
		}
		if(s.equals(t))
			return true;
		//if lengths are different by more than 1, then false
		if(len_1-1>len_2 || len_2-1>len_1)
			return false;
		if(len_1!=len_2){
		//check if remove works
			for(int i=0; i<larger.length(); ++i){
				if((larger.substring(0,i) + larger.substring(i+1)).equals(smaller)){
					return true;
				}
			}
		}
		if(len_1==len_2){
		//check if replace works
			for(int i=0; i<len_1; ++i){
				if(s.charAt(i)!=t.charAt(i)){
					if((t.charAt(i)+s.substring(i+1)).equals(t)){
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args){
		Problem_1_5 p = new Problem_1_5();
		System.out.println(p.oneAway("pale","pale"));
		System.out.println(p.oneAway("pales","pale"));
		System.out.println(p.oneAway("pale","bale"));
		System.out.println(p.oneAway("pale","bake"));
	}
}