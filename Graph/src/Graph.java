
import java.util.*;

public class Graph {
     
	private LinkedList<Integer> adjacency[];//Adjacency Lists
	
	public Graph(int v) {// v=number of vertices
		adjacency=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adjacency[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int s,int d) {
		adjacency[s].add(d);
		adjacency[d].add(s);
	}
	
	public void bfs(int source) {
		boolean visted_nodes[]=new boolean[5];
		int parent_nodes[]=new int[5];
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		visted_nodes[source]=true;
		parent_nodes[source]=-1;
		while(!q.isEmpty()) {
			int p=q.poll();
			System.out.println(p);
			
			for(int i:adjacency[p]) {
				
				if(visted_nodes[i] !=true) {
                    visted_nodes[i]=true;
                     q.add(i);
					parent_nodes[i]=p;
				}
					
				
			}
		}
		
	}
	
	public void dfs(int source) {
		boolean visted_nodes[]=new boolean[5];
		int parent_nodes[]=new int[5];
		Stack<Integer> s=new Stack<>();
		s.add(source);
		visted_nodes[source]=true;
		parent_nodes[source]=-1;
		while(!s.isEmpty()) {
			int p=s.pop();
			System.out.println(p);
			
			for(int i:adjacency[p]) {
				
				if(visted_nodes[i] !=true) {
                    visted_nodes[i]=true;
                     s.add(i);
					parent_nodes[i]=p;
				}
					
				
			}
		}
		
	}
	public static void main(String[] args) {
	
		Graph g=new Graph(5);
		    g.addEdge(0,1);
	        g.addEdge(0, 2);
	        g.addEdge(2, 3);
	        g.addEdge(3, 1);
	        g.addEdge(1, 4);
	        
	    System.out.println("--------------BFS----------------------------");
		g.bfs(2);
		System.out.println("--------------DFS----------------------------");
		g.dfs(2);
	}
}

