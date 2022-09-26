package graphs;
import java.util.*;

//this is a DFS based solution
public class DetectCycleDirected {

	//if descendants direct back to the ancestors, such edge is called back edge
	//in DFS traversal, if there is a back edge then there is a cycle
	boolean DFSRecur(List<ArrayList<Integer>> adj, int s, boolean []visited, boolean[] recStack) {
		visited[s]=true;
		recStack[s]=true; //use recursion call stack to know if u are in recursion
		//the true elements in stack show the ancestors of the given source at any point
		
		for(int i:adj.get(s)) {
			if(visited[i]==false) {
				if(DFSRecur(adj,i,visited,recStack)==true) //these recursive calls will be the descendants of the source
					return true; //if we receive true from any descendant, return true

			}
			else if(recStack[i]==true) //if u are in a recursion call from an ancestor and find it again to be the adjacent of descendant
				//this means that u have found a cycle
				return true;
		}
		recStack[s]=false; //remove from recursion stack as we come back after visiting all adjacents of that element to same place
		return false;
		
	}
	
	
	boolean DFS(List<ArrayList<Integer>> adj, int v) {
		boolean [] visited= new boolean[v+1];
		boolean [] recStack= new boolean[v+1];
		
		for(int i=0;i<v;i++) {
			if(visited[i]==false)
				if(DFSRecur(adj,i,visited,recStack)==true)
					return true;
		}
		return false;
	}
	
}
