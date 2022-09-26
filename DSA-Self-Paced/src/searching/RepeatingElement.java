package searching;
//popular interview problem

//find the element that is repeating in array.
//array has all the elements from 0 to max(arr)
//solution should be O(N) and O(1)
public class RepeatingElement {
	
	//one efficient solution is to use a visited array to mark all the indices visited.
	//or can also use hash set
	
	//most efficient solution-->
	//here we modify the array
	public static int repeatingElement(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int index=Math.abs(arr[i]);
			if(arr[index]<0)return arr[index];
			else
				arr[index]=0-arr[index];
		}
		//unreachable as the array will have one element repeating always as per problem
		return -1;
	}
	
	//if array cannot be modified????
	//tricky approach
	//in Linked list, we find a cycle in the LL using floyds algorithm
	//apply the same --> use array elements as indices that chain
	//we will get an element where there is a loop formed for sure
	public static int findRepeating(int arr[]) {
		int slow=arr[0], fast=arr[0];
		//traverse whole array with fast 2x slow
		//when slow and fast get equal, we are in the loop
		do {
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(slow!=fast);
		//now start from beginning and move fast=1x slow
		slow=arr[0];
		//when slow==fast --> we are at the entry point where the element is repeated
		while(slow!=fast) {
			slow=arr[slow];
			fast=arr[fast];
		}
		return slow;
	}

}
