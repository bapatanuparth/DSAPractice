package graphs;
import java.util.*;

// main algo --> a vertext is pushed in the stack only after all its dependents are pushed 
public class TopologicalSortDFSBased {

	//code exact same to DFS, just adding stack so that all the dependents are pushed before the main element
	public void DFSHelper(List<ArrayList<Integer>> adj, int v) {
		Stack<Integer> st= new Stack<>();
		boolean visited[]= new boolean[v];
		
		for(int i=0;i<adj.size();i++) {
			if(visited[i]==false)
				DFS(adj,i,visited,st);
		}
		
		System.out.println(st); //stack will be filled in order from bottom to top
	}
	
	
	
	//code exact same as DFS except last one line
	public void DFS(List<ArrayList<Integer>> adj, int i,boolean[] visited, Stack<Integer> st) {
		visited[i]=true;
		
		for(int u:adj.get(i)) {
			if(visited[u]==false)
				DFS(adj, u, visited, st);
		}
		
		st.add(i); //adding after whole DFS traversal is done
		//this means that the vertex will be added to stack only after its descendants
		
	}
	
}
