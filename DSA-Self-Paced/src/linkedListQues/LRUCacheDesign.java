package linkedListQues;

import java.util.HashMap;
import java.util.Map;

//implement DS that can work as LRU cache design
class DNode{
	int data;
	DNode next; 
	DNode prev;// self referencial structure
	DNode(int x){
		data=x;
		next=null;
		prev=null;
	}
}

public class LRUCacheDesign {
	
	public static void lruCache(int [] arr, int k) {
		Map<Integer,DNode> map=new HashMap<>();
		DNode start=null, end=null;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				if(count==k) {
					map.remove(end.data);
					end=end.prev;
					end.next=null;
					end.next.prev=null;
					count--;
				}
				DNode temp=new DNode(arr[i]);
				map.put(arr[i], temp);
				if(count==0) {
					start=temp;
					end=start;
					count++;
				}else {
				temp.next=start;
				start.prev=temp;
				start=temp;
				count++;}
			}
			else if(map.containsKey(arr[i])) {
				DNode temp=map.get(arr[i]);
				if(temp==end) {
					end=temp.prev;
					temp.prev=null;
					end.next=null;	
					temp.next=start;start.prev=temp;
					start=temp;
				}else {
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
				temp.next=start;start.prev=temp;
				start=temp;
				}
				
			}
		}
	}
}
