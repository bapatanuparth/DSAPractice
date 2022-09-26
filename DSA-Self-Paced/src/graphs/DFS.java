package graphs;

import java.util.ArrayList;
import java.util.*;

public class DFS {

	//DFS is based on recursion
	//take source, go to first adjacent, and recursively go to all the adjacents of that till end.
	// when all adjacents of 1st adj are done, go to second adjacent from the source
	
	//my code works
	//same code written using boolean visited array of size v like BFS
	Set<Integer> set= new HashSet<>();
	void printDFS(List<ArrayList<Integer>> adj,int v, int s) {
		
		System.out.println(s);
		set.add(s);
		for(int i=0;i<adj.get(s).size();i++) {
			if(!set.contains(adj.get(s).get(i)));
				printDFS(adj,v,adj.get(s).get(i));
		}
	}
	
	
}
