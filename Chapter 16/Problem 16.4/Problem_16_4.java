public class Problem_16_4{

	public boolean ticTacWin(char[][] arr){
		int row=0, col=0;

		return ticTacWin(arr,row,col);
	}

	public boolean ticTacWin(char[][] arr, int row, int col){
			//check right
			if(arr[row][col+1]==arr[row][col])
				if(arr[row][col+2]==arr[row][col])
					return true;
			++row;
			if(arr[row][col+1]==arr[row][col])
				if(arr[row][col+2]==arr[row][col])
					return true;
			++row;
			if(arr[row][col+1]==arr[row][col])
				if(arr[row][col+2]==arr[row][col])
					return true;
			row=0;
			//check down
			if(arr[row+1][col]==arr[row][col])
				if(arr[row+2][col]==arr[row][col])
					return true;
			++col;
			if(arr[row+1][col]==arr[row][col])
				if(arr[row+2][col]==arr[row][col])
					return true;
			++col;
			if(arr[row+1][col]==arr[row][col])
				if(arr[row+2][col]==arr[row][col])
					return true;
			col=0;
			//check diagonals
			if(arr[row+1][col+1]==arr[row][col])
				if(arr[row+2][col+2]==arr[row][col])
					return true;
			row=2;
			if(arr[row-1][col+1]==arr[row][col])
				if(arr[row-2][col+2]==arr[row][col])
					return true;
			return false;
		}
	
	public static void main(String[] args){
		Problem_16_4 p = new Problem_16_4();

		char[][] table = new char[][] {
			{'X','O','X'},
			{'X','O','X'},
			{'O','X','O'}
		};

		System.out.println(p.ticTacWin(table));
	}
}