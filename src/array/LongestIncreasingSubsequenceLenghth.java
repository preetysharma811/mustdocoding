package array;

public class LongestIncreasingSubsequenceLenghth {
	
	//using dp
   static void  longestIncreasingSubSeqArray(int a[]){
    	
	   int dp [] = new int[a.length];
	   
	   for(int i = 0;i<a.length;i++)
	   {
		dp[i]=1;   
	   }
	   
	   for(int i=1;i<dp.length;i++)
	   {
		   for(int j=0;j<i;j++)
		   {
			   if(a[i]>a[j])
			   {
				  dp[i]=Math.max(dp[i],  dp[j]+1);
			   }
		   }
	   }
	   
	   int maxLen=0;
	   
	   for(int i = 0;i<a.length;i++)
	   {
		if(maxLen<dp[i])
				{
			maxLen=dp[i];
				}
	   }
	   
	   System.out.println("max len: "+maxLen);
	   
    }
    
	public static void main(String[] args) {
	int a [] = {0,4,12,2,10,6,9,13,3,11,7,15};
	 int a1[] = { 10, 22, 9, 33, 21, 50, 41, 60 };

	longestIncreasingSubSeqArray(a);
	longestIncreasingSubSeqArray(a1);
	}

}
