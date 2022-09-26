package graphs;
import java.util.*;

public class CreateGraph {

	//using adjacency list
	void addEdge(List<ArrayList<Integer>> adj, int u, int v) {
		
		//create an edge from u to v 
		adj.get(u).add(v);
		
		//create an edge from v to u in case of undirected graph
		adj.get(v).add(u);
	}
	
	
	//if v is the number of vertices in the graph
	void printBFS(List<ArrayList<Integer>> adj, int v) {
		
		boolean visited[] = new boolean[v+1];
		Queue<Integer> q= new ArrayDeque<>();
		q.add(adj.get(0).get(0)); //start from the 1st index
		
		while(!q.isEmpty()) {
			//pop from queue
			int temp=q.poll();
			System.out.println(temp);
			//if not visited, make visited
			if(!visited[temp])
				visited[temp]=true;
			//for each neighbor, if it is not visited add to the queue
			for(int i=0;i<adj.get(temp).size();i++) {
				if(visited[adj.get(temp).get(i)]==false)
					q.add(adj.get(temp).get(i));
			}
		}
		
	}
	
	
	void printDFS(List<ArrayList<Integer>> adj, int s, boolean[] visited ) {
		visited[s]=true;
		System.out.println(s);
		
		for(int i:adj.get(s)) {
			if(visited[i]==false)
			{
				printDFS(adj,i ,visited);			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
