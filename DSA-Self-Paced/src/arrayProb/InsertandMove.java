package arrayProb;

public class InsertandMove {

	public static void main(String[] args) {
		insertAtIndex(new int [] {1, 2, 3, 4,5},6,2,90);
	}
    static public void insertAtIndex(int arr[],int size,int index,int element)
    {
        //Your code here, Geeks
        if(index==size-1)arr[index]=element;
        else{
        for(int i=size-2;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=element;}
    }
}
