public class Stack{
		private class StackNode{
		private int data;
		private StackNode next;

		public StackNode(int data){
			this.data=data;
		}
	}

	private StackNode top;

	public int pop()
	{
		int item=top.data;
		top=top.next;
		return item;
	}

	public void push(int item)
	{	
		StackNode t = new StackNode(item);
		t.next=top;
		top=t;
	}

	public int peek()
	{
		return top.data;
	}

	public boolean isEmpty()
	{
		return top==null;
	}

	public void printStack()
	{
		StackNode t=top;
		while(t!=null)
		{
			System.out.println(t.data);
			t=t.next;
		}
	}

	public Stack sortStack()
	{
		Stack temp = new Stack();
		Stack buffer = new Stack();
		while(isEmpty()==false){
			int max=top.data;

			for(StackNode t =top; t!=null; t=t.next)
			{
				if(t.data>max)
					max=t.data;
			}

			while(top.data!=max){
				int p = pop();
				buffer.push(p);
			}

			temp.push(top.data);
			pop();

			while(buffer.isEmpty()==false){
				push(buffer.pop());
			}
		}


		return temp;
	}


	public static void main(String[] args)
	{
		Stack a = new Stack();
		a.push(5);
		a.push(3);
		a.push(4);
		a.push(1);
		a.push(2);
		Stack b =a.sortStack();
		b.printStack();


	}
}

