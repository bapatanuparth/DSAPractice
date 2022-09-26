package graphs;
import java.util.*;

public class AdjacencyList {
	static void addEdge(List<ArrayList<Integer>> adj, int u, int v) {
		//add v in the arraylist of index u to denote link of u--v
		adj.get(u).add(v);
		//add u in arraylist of index v to denote link of v--u
		adj.get(v).add(u);
		
		//since graph is undirected, we add u to list of v and v to list of u
		
	}
	
	void printGraph(List<ArrayList<Integer>> adj) {
		for(int i=0;i<adj.size();i++) {
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}

//	static void printBFS(List<ArrayList<Integer>> adj, int s) {
//		Queue<Integer> q= new ArrayDeque<>();
//		Set<Integer> set = new HashSet<>();
//		q.add(s);
//		while(!q.isEmpty()) {
//			int temp= q.poll();
//			
//			if(!set.contains(temp)) {
//				System.out.println(temp);
//				set.add(temp);
//			}
//			
//			for(int i=0;i<adj.get(temp).size();i++) {
//				if(!set.contains(adj.get(temp).get(i))) {
//					//System.out.println(adj.get(temp).get(i));
//					q.add(adj.get(temp).get(i));
//				}
//				
//			}
//		}
//	}
	
//	static Set<Integer> set= new HashSet<>();
//	static void printDFS(List<ArrayList<Integer>> adj,int v, int s) {
//		
//		System.out.println(s);
//		set.add(s);
//		for(int i=0;i<adj.get(s).size();i++) {
//			if(!set.contains(adj.get(s).get(i)))
//				printDFS(adj,v,adj.get(s).get(i));
//		}
//	}
	
	
	public static void main(String[] args) {
		int v=7;
		List<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<>());
		}
			addEdge(adj, 0, 1);
			addEdge(adj, 0,2);
			addEdge(adj, 1,3);
			addEdge(adj, 1, 4);
			addEdge(adj, 2,3);
			addEdge(adj, 4,5);
			
			
		
			//printDFS(adj,6, 0);
		//printBFS(adj,0);
	}
	
}
