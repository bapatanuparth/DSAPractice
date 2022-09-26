package sorting;

public class CycleSort {
	
	//this code is assuming that array doesnt have duplicates
	public static void cycleSortDistinct(int arr[]) {
		int n=arr.length;
		int temp;
		for(int cs=0;cs<n-1;cs++) {
			int pos=cs;
			int item=arr[cs];
			for(int i=cs+1;i<n;i++) {
				if(arr[cs]<item)pos++;
			}
			//swap code
			temp=arr[pos];
			arr[pos]=item;
			item=temp;
			
			//this loop ensures that the cycle back to the original starting point is completed
			//we keep swapping the new elements encountered until we come back to the point where cycle started
			while(pos!=cs) {
				pos=cs;
				for(int i=cs+1;i<n;i++) {
					if(arr[i]<item)pos++;
				}
				//swap
				temp=arr[pos];
				arr[pos]=item;
				item=temp;
				//swap
			}
			//we get out of this loop when pos==cs which means weve reached a point where all elements before cs are 
			//at their expected positions
		}
		
	}

	public static void swap(int []arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
