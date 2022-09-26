package queDeque;

import java.util.LinkedList;
import java.util.Queue;

//generate first n numbers using only digits 5 and 6
//ex-
//input: n=8
//output: 5,6,55,56,65, 66, 555,556,565,566
public class GenerateNumbers {
	
	public void generateNumber(int n) {
		Queue<String> q=new LinkedList();
		q.add("5");
		q.add("6");
		//q == 5 6
		for(int i=0;i<=n;i++) {
			String str=q.poll();
			System.out.println(str);
			q.add(str+"5");
			q.add(str+"6");
			//q == 6 55 56 after 1 iteration
			//q == 55 56 65 66 after 2 iterations
		}
	}

}
