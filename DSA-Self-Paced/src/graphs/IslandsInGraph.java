package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//return the number of different connected components of the graph
public class IslandsInGraph {

	//code is exactly same as the code for BFS of disconnected graphs, just add a counter whenever we enter new disconnected part
	int numOfDisconnected(List<ArrayList<Integer>> adj,int v, int s) {
	
		boolean visited[]= new boolean[v+1];

		Queue<Integer> q= new LinkedList<>();
	
		int count=0;
		for(int i=0;i<adj.size();i++) {
		
			if(visited[i]==false) {
				
				count++;
				q.add(i);
				visited[i]=true;
			}
			//run the BFS loop till we cover all the points connected to ith index
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
		return count;
	}
}
