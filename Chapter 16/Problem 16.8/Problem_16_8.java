public class Problem_16_8{

	wordList w = new wordList();

	public String toEnglish(int n){
		return " " + w.h.get(n);
	}

	public String toEnglish(int n, int mod){
		int rem=n%mod;
		String word = " ";

		if(w.h.containsKey(n))
			return " " + w.h.get(n);

		word=toEnglish(rem,mod/10);

		if(w.h.containsKey(n-rem)){
			word=toEnglish(n-rem) + word;
		}
		else{
			word=toEnglish((n-rem)/mod) + toEnglish(mod) + word;
		}
		return word;
	}
	
	public static void main(String[] args){
		Problem_16_8 p = new Problem_16_8();

		System.out.println(p.toEnglish(120000,100000));
	}
}