package graphs;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleUndirected {

	boolean detectCycle(List<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
		visited[s]=true;
		
		for(int i:adj.get(s)) { //for every adjacent of s, check if there is any adjacent previously seen
			
			if(visited[i]==false) {
				if(detectCycle(adj, i, visited, s))
					return true;
			}
			else if(i!=parent) //check if that previously seen adjacent is parent or not 0 -- 1 i.e. confirm that it is not among 2 nodes only
				
				return true;
		}
		return false;
	
	}
	
	//use DFS
	boolean DFS(List<ArrayList<Integer>> adj, int v) {
		boolean [] visited= new boolean[v+1];
		
		for(int i=0;i<v;i++) {
			if(visited[i]==false) { //if node not visited, call recursive function to detect cycle
				if(detectCycle(adj, i, visited, -1))
					return true;
			}
		}
		return false;
		
	}
	
	
}
