package graphs;
import java.util.*;


//BFS based topological sorting
//this is only for acyclic graphs
public class TopologicalSortKahnsAlgo {

	public void topoSort(List<ArrayList<Integer>> adj, int v) {
		int [] indegree= calcIndegree(adj, v);
		
		Queue<Integer> q= new ArrayDeque<>();
		
		for(int i=0;i<indegree.length;i++) { //insert vertices with 0 indegree
			if(indegree[i]==0)q.add(i);
		}
		
		while(!q.isEmpty()) {
			
			int temp=q.poll(); //take vertices out one by one
			System.out.println(temp);
			
			for(int x:adj.get(temp)) { //reduce indegree of each adjacent x of temp
				indegree[x]--;
				if(indegree[x]==0)q.add(x); // if indegree of x becomes 0 == it is not dependant on anyone else, add it to queue
			}
		}
		
	}
	
	public int[] calcIndegree(List<ArrayList<Integer>> adj, int v) {
		int [] indegree= new int[v];
		
		for(int i=0;i<adj.size();i++) {
			
			for(int j=0;j<adj.get(i).size();j++) {
				indegree[adj.get(i).get(j)]++;
			}
		}
		return indegree;
		
	}
	
}
