import java.util.*;

public class circArray<T>{

	ArrayList<T> list = new ArrayList<T>();

	void add(T item){
		list.add(item);
	}

	void swap(int i, int j){
		Collections.swap(list,i,j);
	}

	void rotate(int n){
		for(int j=n;j>0;--j){
			for(int i=list.size()-1; i>0; --i){
				if(i==list.size()-1){
					swap(0,i);
				}
				else{
					swap(i,i+1);
				}
			}
		}
	}

	void print(){
		for(T item : list){
			System.out.print(item + " ");
		}
		System.out.println();
	}
}