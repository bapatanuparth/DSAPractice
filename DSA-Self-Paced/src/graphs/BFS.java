package graphs;
import java.util.*;


//given a source-- find out all the reachable vertices level by level. no vertex should be repeated
public class BFS {

	//code from video
	void printBFS2(List<ArrayList<Integer>> adj,int v, int s) {
		//create array to store if a number is visited
		boolean visited[]= new boolean[v+1];
		//apply logic of tree BFS
		Queue<Integer> q= new LinkedList<>();
		q.add(s);
		visited[s]=true;
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
	
	
	
	//my code works fine -- same as video code but using set
	void printBFS(List<ArrayList<Integer>> adj, int s) {
		Queue<Integer> q= new ArrayDeque<>();
		Set<Integer> set = new HashSet<>();
		q.add(s);
		set.add(s);
		while(!q.isEmpty()) {
			int temp= q.poll();
			System.out.println(q);
		
			
			for(int i=0;i<adj.get(temp).size();i++) {
				if(!set.contains(adj.get(temp).get(i))) {
					set.add(adj.get(temp).get(i));
					q.add(adj.get(temp).get(i));
				}
				
			}
		}
		
		
	}
}
