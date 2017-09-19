public class Problem_7_9{
	
	public static void main(String[] args){
		circArray<Character> c = new circArray<Character>();
		c.add('a');
		c.add('b');
		c.add('c');
		c.add('d');
		c.add('e');
		c.add('f');

		c.rotate(4);
		c.print();
	}
}