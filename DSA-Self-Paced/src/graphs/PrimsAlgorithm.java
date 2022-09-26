package graphs;

import java.util.Arrays;

//this algorithm is used to find the minimum spanning tree and print sum of all the edges in the MST


public class PrimsAlgorithm {

	
	//input is a 2D array with index as vertices and +ve value where there is a link between vertices
	//V == # of vertices
	
	//not the best representation - 2D graph
	//use adjacency list and minheap to store key intead of array for faster approach
	public int primsAlgo(int [][] graph, int V) {
		int res=0;
		
		boolean mSet[]= new boolean[V]; // to know if the vertex is in MST or not yet in MST
		
		int [] key= new int[V];
		Arrays.fill(key, Integer.MAX_VALUE); //initialize key arr to infinite, later on to compare and keep min weight value
		
		key[0]=0; // to begin with, we will consider vertex 0; weight from 0 to 0 will be 0
		
		for(int count=0;count<V;count++) {
			
			int u=-1; //u is the vertex with minimum key value, i.e. minimum weight value amongst all those vertices out of MST
						//initialized to -1 as we are yet to determine which has the minimum weight
			
			for(int i=0;i<V;i++) { //loop to check if key is out of MST and if the keys value < the current value.
				if(!mSet[i] && (u==-1 || key[i]<key[u]))
					u=i;
			}
			//after the loop , u is the vertex which has the minimum key value, i.e. minimum weight amongst all the connections
			mSet[u]=true; //take u vertex in to MST
			
			res=res+key[u]; //update the sum to be outputted
			
			for(int v=0;v<V;v++) { //for each adj v of u
				if(!mSet[v] && graph[u][v]!=0 && graph[u][v]< key[v]){
					key[v]=graph[u][v]; //update the key of a vertex v only if we find that there is a 
					//path u->v with a lower weight going in to the vertex v.
				}
			}
			//after this loop, key[] are updated such that all the non-infinite value are the lowest possible weights of  
			//of that vertex connection
		}
		
		return res;
		
	}
}
