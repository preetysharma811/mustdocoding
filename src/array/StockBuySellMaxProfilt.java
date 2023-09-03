package array;

import java.util.HashMap;
import java.util.TreeSet;

public class StockBuySellMaxProfilt {
	
	static void stockBuySell(int price []){
		
		int minum = Integer.MAX_VALUE;
		int profit = 0;
		int buy =0;
		int sell=0;
	     HashMap<Integer, Integer> buySell = new HashMap<Integer,Integer>();
		
		for(int i=0;i<price.length-1;i++)
		{
			
	      if(price[i]<minum)
	      {
	    	  minum=price[i];
	    	  int currentProfit= price[i] - minum;
	    	  if(profit < currentProfit) {
	    	  profit =currentProfit;
	    	 
	    	  buy=minum;
	    	  sell=price[i];
	    	  
	    	  } 
	      }
	      
	      else {
	    	  int currentProfit= price[i] - minum;
	    	  if(profit < currentProfit) {
	    		  profit =currentProfit;
	    		//   buySell.put(minum, price[i]);
	    		  buy=minum;
	 	    	  sell=price[i];
	        }
		  }	 
	      
	      buySell.put(minum, price[i]);
		}		
		
		System.out.println(buySell);      
	    System.out.println("buy-----------"+buy);
	    System.out.println("sell-----------"+sell);
	  	System.out.println(profit);
	}

	public static void main(String[] args) {
		 int price [] = {100, 180, 260, 310, 40, 535, 695};
		// int m =4;
		 stockBuySell(price);
       
	}

}
