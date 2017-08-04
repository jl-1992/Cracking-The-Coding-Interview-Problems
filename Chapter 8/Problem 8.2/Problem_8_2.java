import java.util.*;

public class Problem_8_2{
	public static ArrayList<String> findPath(){
		char arr[][] = {
		   {' ',' ',' ',' ',' '},
		   {' ',' ','~',' ',' '},
		   {' ','~',' ',' ','~'},
		   {' ',' ',' ',' ','~'},
		   {' ',' ',' ','~',' '},
		   {' ','~',' ',' ','~'},
		   {'~',' ',' ',' ',' '},
		   {' ',' ',' ',' ',' '}
		};
		int row=arr.length-1,col=arr[0].length-1;
		ArrayList<String> list = new ArrayList<String>();
		if(findPath(arr,list,row,col))
			return list;
		return null;
	}

	public static boolean findPath(char arr[][], ArrayList<String> list, int row, int col){
		if(col<0 || row<0 || arr[row][col]=='~'){
			return false;
		}
		if(row==0 && col==0)
			return true;
		if(findPath(arr,list,row,col-1)){
			list.add("right");
			return true;
		}
		if(findPath(arr,list,row-1,col)){
			list.add("down");
			return true;
		}

		return false;
	}

	public static void main(String[] args){
		ArrayList<String> s = new ArrayList<String>();
		s=findPath();
		for(String t:s)
			System.out.println(t);
	}
}