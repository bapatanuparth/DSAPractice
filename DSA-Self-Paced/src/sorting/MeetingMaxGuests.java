package sorting;

import java.util.Arrays;

//you are given 2 arrays --> arrival and departure timing of people coming to a party
//indexes of arrays map to 1 person
//ex. 0th index in arr array is for Parth's arrival and 0th index in dep is parth's departure
//you have to give how many maximum guests can be there at the meeting due to overlap of timings
public class MeetingMaxGuests {

	public static int maxGuests(int arr[], int dep[]) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=1,j=0,res=1,curr=1;
		
		//create a timeline and check at every point in time how many guests are there
		while(i<arr.length && j<arr.length) {
			//check on arrival of every guest if their time of arrival < departure of previous guest
			//if yes increase the count of ppl present at that time
			if(arr[i]<=dep[j]) {
				curr++;i++;
			}else {
				curr--;j++;
			}
			res=Math.max(curr, res);
		}
		return res;
	}
}
