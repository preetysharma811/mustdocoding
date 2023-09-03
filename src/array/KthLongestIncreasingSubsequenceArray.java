package array;

public class KthLongestIncreasingSubsequenceArray {
	
	public static void longestSubSequence(int ar[]) {
	
		int i=0;
		int lenghtArray [] = new int[ar.length] ;
	    int subSeqArray [] = new  int[ar.length] ;
	    while(i<lenghtArray.length-1)
	    {
	    	 lenghtArray[i]=1;
	    	 i++;
	    }
	  
	    
	    for (int k =1;k<ar.length;k++)
	    {
	    	 for (int j =0;j<k;j++)
	    	 {
	    		 if(ar[j]<ar[k])
	    		 {
	    			 if( lenghtArray[k]<lenghtArray[j]+1||lenghtArray[k]==lenghtArray[j]+1) {
	    			 lenghtArray[k]=lenghtArray[j]+1;
	    			 subSeqArray[k]=j;
	    			
	    			 } 
	    		  }
	    		 
	    	 }
	    }
	  
	    System.out.println("\nLength: \n"); 
		printArr(lenghtArray);
		  
	    System.out.print("array index:\n"); 
		printArr(subSeqArray);
		
		int maxIndex=getMaxValue(lenghtArray);
		subSequence(subSeqArray,ar,maxIndex);
	}


	static void printArr(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.print("\n");
	}
	
	static int getMaxValue(int[] arr1) {
		
		int max=arr1[0];
		int index=0;
		for (int i = 1; i < arr1.length-1; i++) {
		 if (max<arr1[i+1])
		 {
			 max= arr1[i+1];
			 index=i+1;
		 }
		}
		System.out.print("Longest Length: "+ max + "\n");
		return index;
	 
	}
	
    static void subSequence(int[] arr1, int actual[] ,int index) {
		int i=index;
		 System.out.print("sub sequence---------------\n");
     while(i>0) {	
		  System.out.print(actual[i]+",");
		  i=arr1[i];
		}
	
	}
	// not for kth
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
//     System.out.println("Array:"); 
//	printArr(a);
	//longestSubSequence(a);
	longestIncreasingSubSeqArray(a);
	longestIncreasingSubSeqArray(a1);
	}

}
