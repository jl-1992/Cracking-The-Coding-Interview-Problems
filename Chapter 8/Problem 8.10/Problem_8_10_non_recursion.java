public class Problem_8_10_non_recursion{
	
	public void paint_fill(char[][] arr, int row, int column, char c){
		//check up
		int count=0;
		char temp = arr[row][column];

		for(int i = row-1; i>=0; --i){
			for(int j=0; j<arr[0].length; ++j){
				if(arr[i][j]==c)
					++count;
			}
			if(count==0){
				row=i;
				break;
			}
			count=0;
		}

		for(int i=row; i<arr.length; ++i){
			for(int j=0; j<arr[0].length;++j){
				if(arr[i][j]==temp){
					arr[i][j]=c;
					++count;
				}
			}
			if(count==0)
				break;
			count=0;
		}
		
	}

	public static void main(String[] args){
		Problem_8_10_non_recursion p = new Problem_8_10_non_recursion();
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

		p.paint_fill(image,1,2,'o');

		for(int i=0; i<image.length;++i){
			for(int j=0; j<image[0].length;++j){
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
	}
}