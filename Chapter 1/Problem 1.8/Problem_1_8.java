import java.util.ArrayList;

public class Problem_1_8{

	ArrayList<pair> list = new ArrayList<pair>();

	class pair{
		int i;
		int j;

		public pair(int i, int j){
			this.i=i;
			this.j=j;
		}
	}

	public int[][] zeroMatrix(int[][] arr){
		for(int i=0; i<arr.length;++i){
			for(int j=0; j<arr[0].length; ++j){
				if(arr[i][j]==0)
					list.add(new pair(i,j));
			}
		}

		for(pair p : list){
			for(int k=0, l=0; k<arr[0].length && l<arr.length; ++k,++l){
				arr[p.i][k]=0;
				arr[l][p.j]=0;
			}
		}

		return arr;
	}

	public void printMatrix(int[][] arr){
		for(int i=0; i<arr.length;++i){
			for(int j=0; j<arr[0].length; ++j){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args){
		Problem_1_8 p = new Problem_1_8();

		int[][] matrix = {
			{1,2,3},
			{4,0,6},
			{0,5,3}
		};	

		p.printMatrix(matrix);

		matrix = p.zeroMatrix(matrix);
		System.out.println("------------------");
		p.printMatrix(matrix);
	}
}