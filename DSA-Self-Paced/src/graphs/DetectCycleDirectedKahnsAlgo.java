package graphs;
import java.util.*;


//detect cycle of directed graph using kahn's algorithm
public class DetectCycleDirectedKahnsAlgo {

	
	//based on the fact that if graph has a cycle, 
	//then during performing kahn's algorithm we will come across a situation where indegree of any of the vertices !=0
	//ex. a --> b-->c -->a is a cycle in graph, then in degree of all these vertices is 1
	//so in kahn's algo, there wont be any element in q and the code comes out of loop before completing all vertices
	//we count the number of times the while loop runs, if count == v, means kahns algo ran completely and hence no cycle
	// if count < v, means there is a cycle in the graph
	public boolean detectCycle(List<ArrayList<Integer>> adj, int v) {
		int[] indegree= calcIndegree(adj, v);
		Queue<Integer> q= new ArrayDeque<>();		
		for(int i=0;i<indegree.length;i++) {
			if(indegree[i]==0)q.add(i);
		}
		int count=0; //count how many vertices we are coming across with 0 indegree 
		while(!q.isEmpty()) {
			int temp=q.poll();
			
			for(int x:adj.get(temp)) {
				indegree[x]--;
				if(indegree[x]==0)q.add(x);
			}
			count++;
		}
		
		return count!=v;
		}
	
	public int [] calcIndegree(List<ArrayList<Integer>> adj, int v) {
		int [] indegree= new int[v];
		
		for(int i=0;i<adj.size();i++) {
			//indegree[i]++;
			
			for(int j=0;j<adj.get(i).size();j++) {
				indegree[adj.get(i).get(j)]++;
			}
		}
		return indegree;
	}
}
