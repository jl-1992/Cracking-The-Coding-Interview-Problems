public class Problem_8_10_recursive{
	
	public void paint_fill(char[][] arr, int row, int column, char c){
		char temp=arr[row][column];
		arr[row][column]=c;
		//check up
		if(row>0 && arr[row-1][column]==temp)
			paint_fill(arr,row-1,column,c);
		//check right
		if(column<arr[0].length-1 && arr[row][column+1]==temp)
			paint_fill(arr,row,column+1,c);
		//check down
		if(row<arr.length-1 && arr[row+1][column]==temp)
			paint_fill(arr,row+1,column,c);
		//check left
		if(column>0 && arr[row][column-1]==temp)
			paint_fill(arr,row,column-1,c);

	}

	public static void main(String[] args){
		Problem_8_10_recursive p = new Problem_8_10_recursive();
		char[][] image = new char[][]{
						 {'w', 'w', 'w', 'w', 'w'},
						 {'w', 'w', 'w', 'w', 'w'},
						 {'w', 'w', 'w', 'w', 'w'},
						 {'w', 'w', 'b', 'b', 'w'},
						 {'w', 'b', 'b', 'b', 'b'},
						 {'w', 'b', 'b', 'b', 'b'},
						 {'w', 'w', 'b', 'b', 'w'},
						 {'w', 'w', 'w', 'w', 'w'}
						};
		for(int i=0; i<image.length;++i){
			for(int j=0; j<image[0].length;++j){
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("--------------");
		System.out.println();

		p.paint_fill(image,4,2,'o');

		for(int i=0; i<image.length;++i){
			for(int j=0; j<image[0].length;++j){
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
	}
}