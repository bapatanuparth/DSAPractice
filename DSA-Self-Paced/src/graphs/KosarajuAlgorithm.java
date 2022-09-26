package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//used to find strongly connected components
public class KosarajuAlgorithm {

	
	
	//step 1 == arrange the vertices according to discending order of their DFS finish time
	void kosaraju(List<ArrayList<Integer>> adj, int v) {
	
		//step 1 -> get the descending order of DFS finish time in stack
		Stack<Integer> st= new Stack<>();
		boolean[] visited= new boolean[v]; 
		
		for(int i=0;i<adj.size();i++) {
			if(visited[i]==false) {
				fillOrder(adj, st,i,visited);
			}
		}
		
		//step 2-->
		//get transpose
		List<ArrayList<Integer>> trans=getTranspose(adj, v);
		
		//step 3--> DFS of the new graph
		dfsUtil(adj, v);
	}
	//perform DFS and fill in order
	static void fillOrder(List<ArrayList<Integer>> adj, Stack<Integer> st, int s, boolean [] visited){
		visited[s]=true;
		for(int u:adj.get(s)) {
			if(visited[u]==false)
				fillOrder(adj,st,u,visited);
		}
		st.push(s);
		
	}
	
	//STEP 2  == GET TRANSPOSE
	//create transpose of adj list so that the arrow directions are reversed of the graph directions
	List<ArrayList<Integer>> getTranspose(List<ArrayList<Integer>> adj, int v) {
		List<ArrayList<Integer>> trans= new ArrayList<>(v);
		
		for(int i=0;i<adj.size();i++) {
			
			for(int u:adj.get(i)) {
				trans.get(u).add(i);
			}
			
		}
		return trans;
	}
	
	//STEP 3 --> PERFORM DFS
	void dfsUtil(List<ArrayList<Integer>> adj, int v) {
		boolean[] visited= new boolean[v]; 
		
		for(int i=0;i<adj.size();i++) {
			if(visited[i]==false) {
				DFS(adj,i,visited);
			}
		}
	}
	
	void DFS(List<ArrayList<Integer>> adj, int s,boolean[] visited) {
		visited[s]=true;
		for(int u:adj.get(s)) {
			if(visited[u]==false)
				DFS(adj,u,visited);
		}
	}
}
