public class Graph{

	public Node[] nodes= new Node[10];
	public boolean found=false;

	public boolean route(Graph g, Node start, Node end)
	{
		for(int i=0;i<start.children.length;++i){
			if(start.children[i]!=null && start.children[i].visited==false){
				start.children[i].visited = true;
				System.out.println(start.children[i].data + " visited!");
				if(start.children[i].data==end.data) g.found=true;
				route(g,start.children[i],end);
				}
			}
		return g.found;
	}
}