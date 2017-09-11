import java.util.HashMap;

public class Problem_4_7{

	public String buildOrder(String[] projects, Pair[] dependencies){

		Graph g = new Graph();
		HashMap<String,Node> h = new HashMap<String,Node>();
		String order = "";
		int max=0, min=0;

		for(int i=0; i<projects.length; i++){
			g.add(new Node(projects[i]));
			h.put(projects[i],g.get(i));
		}

		for(Pair p : dependencies){
			for(Node n : g.nodes){
				if(p.y.equals(n.data)){
					n.add(h.get(p.x));
				}
			}
		}

		for(Node n: g.nodes){
			n.parents = n.parentNodes.size();
			for(Node t : n.parentNodes){
				++t.children;
			}
		}

		for(Node n: g.nodes){
			if(n.children>max)
				max=n.children;
		}

		int g_max=max;

		while(max>=0){
			for(int i=0; i<=g_max; ++i){
				for(Node n: g.nodes){
					if(n.children==max && n.parents==min){
						order+=n.data + " ";
					}
				}
				++min;
			}
			--max;
			min=0;
		}

		return order;
	}
	
	public static void main(String[] args){
		Problem_4_7 p = new Problem_4_7();

		String[] projects = {"a","b","c","d","e","f"};
		Pair[] dependencies = {new Pair("a","d"), new Pair("f","b"), new Pair("b","d"), new Pair("f","a"), new Pair("d","c")};

		System.out.println(p.buildOrder(projects,dependencies));


	}
}