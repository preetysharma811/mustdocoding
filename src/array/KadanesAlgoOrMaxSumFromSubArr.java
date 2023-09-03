package array;

public class KadanesAlgoOrMaxSumFromSubArr {

	public static int maxSumOfSubArray(int arr[]) {
		
	   int total =0;
	   int max=Integer.MIN_VALUE;
	   int startIndex=0;
	   int endIndex=0;
	   int tempStart=0;

       for (int i=0;i<=arr.length-1;i++)
        {
    	   total+=arr[i];
    	   
    	   if(total<arr[i])
           {
         	  total=arr[i];
         	 //  startIndex=i;
         	  
           }
    	   
          if(max<total)
          {
        	  max=total;
        	  startIndex=tempStart;
        	  endIndex=i;
        	  
          }
         
         if (total<0) {
        	 total=0; 
         tempStart=i+1;
         }		
	   }
   	   System.out.println("\nMax sum: "+max);	

      findSubArray(arr,startIndex,endIndex);
      
	  return max;
	}
	
	static void kadaneAlgo(int a [])
	{
		int start=0;
		int end =0;
		int maxSum =0;
		int calSum=0;
		for(int i = 0; i < a.length;i++)
		{
			calSum+=a[i];
			
//			if(calSum<a[i])
//			{
//				calSum=a[i];
//			}
			
			   if(maxSum<calSum)
		          {
				   maxSum=calSum;	
				   end=i;
		        	  
		          }
			
			if(calSum<0)
			{
				start=i+1;
				calSum=0;
			}
			
			
		}
		
	    System.out.println("\nstart index:"+ start);
	    System.out.println("end index:"+ end);
	    System.out.println("maxSum:"+ maxSum);
	    findSubArray(a,start,end);
	}
	
	
	 static long geekSForGeeskTCsmaxSubarraySum(int a[]){
	       
			int maxSum =Integer.MIN_VALUE;
			int calSum=0;
			for(int i = 0; i < a.length;i++)
			{
			    calSum = calSum+a[i];
			   
			 calSum= Math.max(calSum, a[i]);
			maxSum = Math.max(calSum, maxSum);
			
	        }
	    
	    return maxSum;
	    
	}
	
	public static void findSubArray(int arr[], int startIndex, int endIdex) {
     // System.out.println("start: "+startIndex+" & end: "+endIdex);
      System.out.println("sub array: ");
		for (int i=startIndex;i<=endIdex;i++) {
			System.out.print(arr[i]+",");
		}
		
	  }

	
	static void maxSumFromSubArrayDP(int[]  a)
	{
		int [] dp = new int[a.length+1];
		dp[0] = 0;
		
		for(int i =1;i<dp.length;i++)
		{
			dp[i]=Math.max(dp[i-1]+a[i-1], a[i-1]);
		}
		
		   int max=dp[0];
		
		 for (int j = 1; j <dp.length ; j++) {
	            if(max<dp[j])
	                max = dp[j];
	        }
		 
		 System.out.println("\nfrom dp: "+max);

	}
	
	public static void main(String[] args) {

		int[] arr = new int[]{4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
		int [] ar1={-2, -3, 4, -1, -2, 1, 5, -3};
		int [] ar2= {-2,1,-3,4,-1,2,1,-5,4};
		int [] ar3= {5,-4,-2,6,-1};
	
		//maxSumOfSubArray(arr);	
		//maxSumOfSubArray(ar1);
		//maxSumOfSubArray(ar2);
		//maxSumFromSubArrayDP(ar2);
		kadaneAlgo(ar1);
		kadaneAlgo(ar3);
		geekSForGeeskTCsmaxSubarraySum(arr);
	  }

}
