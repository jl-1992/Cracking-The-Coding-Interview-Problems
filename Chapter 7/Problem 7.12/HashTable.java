public class HashTable{
	public Node[] arr = new Node[10];

	public int HashFunc(int n){
		return n % arr.length;
	}

	public void addNum(int n){
		int value = HashFunc(n);
		if(arr[value]==null){
			arr[value]= new Node(n,null);
			arr[value].key=value;
		}
		else{
			Node temp=arr[value];
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new Node(n,null);
			temp.next.key=value;
		}	
	}

	public void printHash(){
		for(int i=0;i<arr.length;++i){
			for(Node temp = arr[i]; temp!=null;temp=temp.next){
				System.out.print(temp.data + " ");
			}
			System.out.println();
		}
	}

	public int get(int key){
		if(arr[key]==null)
			return -1;
		return arr[key].data;
	}
}