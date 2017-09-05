import java.util.*;

public class Problem_10_2{

	public void sortAnagrams(String[] arr){
		int temp_index = 1;
		int count=0;
		for(int i=0; i<arr.length-1;i=count){
			char[] d = arr[i].toCharArray();
			Arrays.sort(d);
			String t = new String(d);
			for(int j=temp_index; j<arr.length;++j){
				char[] c = arr[j].toCharArray();
				Arrays.sort(c);
				String s = new String(c);
				if(s.equals(t)){
					++count;
					String temp = arr[temp_index];
					arr[temp_index]=arr[j];
					arr[j]=temp;
					if(temp_index!=arr.length-1)
						++temp_index;
				}
			}
			if(count<arr.length-1)
				++count;
			if(temp_index+1<=arr.length-1)
				++temp_index;
		}
	}
	
	public static void main(String[] args){
		Problem_10_2 p = new Problem_10_2();
		//String[] s = {"abc", "d", "cab", "gfe", "dd", "feg", "cba"};
		String[] s = {"d", "c", "a", "bca", "c", "abc", "b", "a", "d"};
		for(int i=0; i<s.length;++i)
			System.out.println(s[i]);
		System.out.println("------------------------------");
		p.sortAnagrams(s);
		for(int i=0; i<s.length;++i)
			System.out.println(s[i]);
	}
}