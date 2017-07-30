import java.util.*;

public class SetOfStacks{
		private class StackNode{
		private int data;
		private StackNode next;

		public StackNode(int data){
			this.data=data;
		}
	}

	private int threshold;
	private ArrayList<StackNode> a = new ArrayList<StackNode>();
	private StackNode top;
	private int count=0;

	public SetOfStacks(int i)
	{
		threshold=i;
	}

	public int pop()
	{
		int item=top.data;
		top=top.next;
		--count;
		return item;
	}

	public void popAt(int index)
	{
		a.remove(index);
	}

	public void push(int item)
	{	
		if(count==threshold)
		{
			a.add(top);
			top =null;
			count=0;
		}
		StackNode t = new StackNode(item);
		t.next=top;
		top=t;
		++count;
	}

	public int peek()
	{
		return top.data;
	}

	public boolean isEmpty()
	{
		return top==null;
	}

	public void printStack(int j)
	{
		StackNode t=a.get(j);
		while(t!=null)
		{
			System.out.println(t.data);
			t=t.next;
		}
	}


	public static void main(String[] args)
	{
	    SetOfStacks b = new SetOfStacks(2);
		b.push(5);
		b.push(3);
		b.push(7);
		b.push(8);
		b.push(9);
		b.push(10);
		b.push(11);
		b.popAt(1);
		b.printStack(1);
	}
}

