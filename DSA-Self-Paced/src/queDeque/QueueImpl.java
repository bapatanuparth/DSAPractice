package queDeque;

//Queue implementation using array
class Queue{
	int size,cap;
	int []arr;
	public Queue(int c) {
		// TODO Auto-generated constructor stub
		cap=c;
		size=0;
		int arr[]=new int[c];
	}
	
	int getFront() {
		if(isEmpty())return -1;
		return 0;
	}
	int getRear() {
		if(isEmpty())return -1;
		return size-1;
	}
	
	boolean isFull() {
		return size==cap;
	}
	
	boolean isEmpty() {
		return size==0;
		
	}
	
	void enque(int x) {
		if(isFull())return;
		arr[size]=x;
		size++;
	}
	
	void deque() {
		if(isEmpty())return;
		for(int i=0;i<size-1;i++) {
			arr[i]=arr[i+1];
			size--;
		}
		
	}
	
}

public class QueueImpl {

}
