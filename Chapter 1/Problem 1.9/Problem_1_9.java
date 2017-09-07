public class Problem_1_9{
	

	public boolean stringRotation(String s1, String s2){
		char pivot = s1.charAt(0);
		String temp = "";
		String temp2 = "";
		int index=0;
		boolean flag=false;

		for(int i=0; i<s2.length(); i++){
			if(pivot==s2.charAt(i)){
				index=i;
				flag=true;
			}
			if(flag){
				temp+=s2.charAt(i);
			}
		}

		for(int i=0; i<index; i++){
			temp2+=s2.charAt(i);
		}

		if((temp+temp2).equals(s1))
			return true;
		return false;
	}

	public static void main(String[] args){
		Problem_1_9 p = new Problem_1_9();

		System.out.println(p.stringRotation("waterbottle","erbottlewat"));
	}
}