package array;

public class Sort012array {

	//sort an array containing only 0 1 2 without using sorting algorithm
	  public static void sort012(int a[], int n)
	    {
	        // code here 
	        int zeros=0;
	        int ones=0;
	        int twos=0;
	        
	        for(int i=0;i<a.length;i++){
	            if(a[i]==0)
	            zeros++;
	            if(a[i]==1)
	            ones++;
	            if(a[i]==2)
	            twos++;
	        }
	        
	        int i=0;
	        while(zeros>0){
	            a[i]=0;
	            zeros--;
	            i++;
	        }
	        while(ones>0){
	            a[i]=1;
	            ones--;
	            i++;
	        }
	        while(twos>0){
	            a[i]=2;
	            twos--;
	            i++;
	        }
	        
	    }
}
