public class Node{
	
	int data;
	Node next;

	public Node(int data, Node next){
		this.data=data;
		this.next=next;
	}

	public int length(){
		int len=0;
		for(Node temp=this; temp!=null; temp=temp.next)
			++len;
		return len;
	}

	public void add(int num){
		Node temp;
		for(temp=this; temp.next!=null; temp=temp.next){}
		temp.next=new Node(num,null);
	}
}