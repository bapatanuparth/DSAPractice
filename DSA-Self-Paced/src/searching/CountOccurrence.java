package searching;

//count number of occurrences of an element in sorted array
public class CountOccurrence {
	
	//calculate first occurrence and last occurrence and take difference of both
	public static int countOcur(int arr[], int num) {
		int first= IndexOfFirstOccurrence.firstOccur(arr, 0, arr.length-1, num);
		
		if(first==-1)return 0;
		else 
			return (IndexOfLastOccurrence.lastOccur(arr, 0, arr.length-1, num)-first+1);
	}

}
