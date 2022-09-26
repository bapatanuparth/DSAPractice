package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//DFS for disconnected graphs
public class DFS2 {
	
	Set<Integer> set= new HashSet<>();
	
	//O(V+E)
	void DFShelper(List<ArrayList<Integer>> adj,int v) {
		//run a loop through adjacency list and check which vertex has not been visited
		//call DFS print considering that vertex. this will print all the connected nodes to the i vertex in that run
		for(int i=0;i<adj.size();i++) {
			if(!set.contains(i))
				printDFS(adj, v, i);
		}
	}
	
	//count how many different connected components are there in graph
	int countConnectedComponents(List<ArrayList<Integer>> adj,int v) {
		int count=0;
		for(int i=0;i<adj.size();i++) {
			if(!set.contains(i))
			{
				count++;
				printDFS(adj, v, i);
			}
		}
		return count;
	}
	
	void printDFS(List<ArrayList<Integer>> adj,int v, int s) {
		
		System.out.println(s);
		set.add(s);
		for(int i=0;i<adj.get(s).size();i++) {
			if(!set.contains(adj.get(s).get(i)));
				printDFS(adj,v,adj.get(s).get(i));
		}
	}

}
