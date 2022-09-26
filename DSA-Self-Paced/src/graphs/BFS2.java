package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//traverse through all the vertices when some vertices can be disconnected. 
//No source is given
public class BFS2 {

	//time complexity is O(V+E)
	void printBFSdisconnected(List<ArrayList<Integer>> adj,int v, int s) {
		//create array to store if a number is visited
		boolean visited[]= new boolean[v+1];
		//apply logic of tree BFS
		Queue<Integer> q= new LinkedList<>();
		//run a loop through whole array because we don't know which vertices can be disconnected.
		//these disconnected vertices will be part of adjacency list
		for(int i=0;i<adj.size();i++) {
			//select 1st index in place of source
			//during every iteration, check if vertex is covered previously, if not, it means it is a new disconnected vertex
			//begin new BFS for this disconnected point
			if(visited[i]==false) {
				q.add(i);
				visited[i]=true;
			}
			//run the BFS loop till we cover all the points connected to 0th index
			while(!q.isEmpty()) {
				//get from queue and print
				int u= q.poll();
				System.out.println(u);
				
				for(int val:adj.get(u)) {
					//if not visited, then only add to the queue
					if(visited[val]==false) {
						q.add(val);
						visited[val]=true;
					}
				}
			}
		}
		
	}
}
