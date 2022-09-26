package greedy;
import java.util.*;
import javafx.util.Pair;

//In a stock market, there is a product with its infinite stocks. The stock prices are given for N days, where arr[i] denotes the price of the stock on the ith day. There is a rule that a customer can buy at most i stock on the ith day. If the customer has an amount of k amount of money initially, find out the maximum number of stocks a customer can buy. 
//
//For example, for 3 days the price of a stock is given as 7, 10, 4. You can buy 1 stock worth 7 rs on day 1, 2 stocks worth 10 rs each on day 2 and 3 stock worth 4 rs each on day 3.

//Input : price[] = { 10, 7, 19 }, 
//k = 45.
//Output : 4
//A customer purchases 1 stock on day 1 for 10 rs, 
//2 stocks on day 2 for 7 rs each and 1 stock on day 3 for 19 rs.Therefore total of
//10, 7 * 2 = 14 and 19 respectively. Hence, 
//total amount is 10 + 14 + 19 = 43 and number 
//of stocks purchased is 4.
public class MaxStocksIfiStocksBought {
	
	int maxStocks(int [] arr , int k) {
		
		Queue<Pair<Integer, Integer>> q= new PriorityQueue<>((a,b)-> a.getKey()-b.getKey());
		
		//save the array in form of pair of (arr[i], i+1) as ith stock can be bought max i+1 times
		//sort the array in increasing order or arr[i] we want to maximize the number of stocks. so we try to pick max of low value stock
		for(int i=0;i<arr.length;i++) {
			Pair<Integer, Integer> p= new Pair<>(arr[i], i+1);
			q.add(p);
		}
		
		int sum=0;
		//from minheap , choose each stock one by one and try to take it as many times as possible
		//as its in ascending order, here we maximize the number of stocks taken
		while(!q.isEmpty()) {
			Pair<Integer, Integer> p= q.poll();
			int key= p.getKey();
			int val= p.getValue();
			
			for(int i=0;i<val;i++) {
				sum+=key;
				if(sum>k)
					{
					sum-=key;
					return sum;
					}
			}
			
		}
		
		return sum;
	}
}
