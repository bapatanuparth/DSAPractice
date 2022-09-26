package queDeque;

//queue efficient implementation
//in this we use circular implementation
//so we add elements in circular fashion in array on overflow. hence, operations like deque O(1)
//also no space in arr is wasted
class QueueEff{
	int arr[];
	int front,cap,size;
	public QueueEff(int c) {
		// TODO Auto-generated constructor stub
		arr=new int[c];
		cap=c;
		front=0;size=0;
	}
	
	boolean isFull() {
		return size==cap;
	}
	
	boolean isEmpty() {
		return size==0;
		
	}
	
	int getFront() {
		if(isEmpty())return -1;
		return front;
	}
	int getRear() {
		if(isEmpty())return -1;
		return (front+size-1)%cap;
	}
	
	void enque(int x) {
		if(isFull())return;
		int rear=getRear();
		rear=(rear+1)%cap;
		arr[rear]=x;
		rear++;
	}
	
	void deque() {
		if(isEmpty())return;
		front=(front+1)%cap;
		size--;
	}
}

public class QueueImplEff {
	
	

}
