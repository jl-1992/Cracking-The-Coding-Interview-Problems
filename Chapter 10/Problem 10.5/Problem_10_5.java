public class Problem_10_5{

	public int sparse_search(String s, String[] arr){
		int count=0;
		for(String b : arr){
			if(b==s)
				return count;
			++count;
		}
		return -1;
	}
	
	public static void main(String[] args){
		Problem_10_5 p = new Problem_10_5();
		String[] arr = {"at", "", "", "", "ball", "", "","car","","","dad","",""};
		System.out.println(p.sparse_search("ball",arr));
	}
}