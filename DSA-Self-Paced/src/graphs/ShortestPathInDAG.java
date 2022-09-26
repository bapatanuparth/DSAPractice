package graphs;
import java.util.*;


//shortest path in direct acyclic graph

//creating class fr vertext to store the weight
class AdjListVertex{
	int v;
	int w;
	public AdjListVertex(int _v, int _w) {
		// TODO Auto-generated constructor stub
		v=_v;
		w=_w;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	
	
}

public class ShortestPathInDAG {
	
	//function to perform topological sort
	public void topologicalSortUtil(List<ArrayList<AdjListVertex>> adj,AdjListVertex s, boolean[] visited, Stack<AdjListVertex> st) {
		
		visited[s.getV()]=true;
		for(AdjListVertex u:adj.get(s.getV())) {
			if(visited[u.getV()]==false)
				topologicalSortUtil(adj, u, visited, st);
		}
	
		st.add(s);
	}
	
	
//steps -->
	//perform topological sort --> in that order check the distance and weights based on the formula
	public void shortestPath(List<ArrayList<AdjListVertex>> adj, int v) {
		
		Stack<AdjListVertex> st= new Stack<>();
		boolean visited[] = new boolean[v];
		//perform topological sort
		for(int i=0;i<adj.size();i++) {
			for(AdjListVertex u:adj.get(i)) {
				if(visited[u.getV()]==false) {
					topologicalSortUtil(adj,u, visited, st);
				}
			}
		}
		
		//here we have the stack in order of topological sort
		//now calculate shortest distance of weighted graph
		int dist[]= new int[v];
		for (int i = 0; i < v; i++)
            dist[i] = Integer.MAX_VALUE;
        dist[st.peek().getV()]=0;
         	
        while(!st.empty())
        {
        	AdjListVertex u=st.pop();
        	
        	for(AdjListVertex a:adj.get(u.getV())){
        		//use this formula proven by algorithm to reset the shortest distance of every node
        		if(dist[a.getV()]> dist[u.getV()]+ u.getW())
        			dist[a.getV()]= dist[u.getV()]+ u.getW();
        	}
        }
        
        //print the shortest distances
        for (int i = 0; i < v; i++)
        {
            if (dist[i] == Integer.MAX_VALUE)
                System.out.print( "INF ");
            else
                System.out.print( dist[i] + " ");
        }
	}
	
}
