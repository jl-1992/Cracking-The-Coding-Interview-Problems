import java.util.HashMap;
import java.io.*;

public class Problem_16_2{

	public static HashMap wordFreq(File file){
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line=br.readLine())!=null){
				Scanner s = new Scanner(line).useDelimiter("\\s");
				String sc=s.next();
				while(sc){
					if(h.put(sc,0)==false)
						h.put(sc,++h.get(sc));
					else{
						h.put(sc,0);
					}
					sc=s.next();
				}
			}
		}

		return h;
	}
	

	public static void main(String[] args){
		HashMap<String, Integer> h = new HashMap<String, Integer>();

		h=wordFreq("Harry Potter and the Sorcerer's Stone");
	}
}