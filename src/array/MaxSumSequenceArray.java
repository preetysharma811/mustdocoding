package array;

public class MaxSumSequenceArray {
	
	static void maxSumArray(int a[])
	{
		int tempArr [] =  new int[a.length];
		int indexArr [] = new int [a.length];
		for (int i =0 ;i <a.length;i++) {
			 tempArr[i] = a[i];
			 indexArr[i]=i;
		}
		//int index=0;
		 System.out.println("original array------- ");
		 printArr(a);	
		for(int i =1;i<a.length;i++)
		{
			for(int j = 0 ;j<i ;j++)
			{
				if (a[i]>a[j])
				{
					if(tempArr[i]<tempArr[j]+a[i])
				{
					
					
					tempArr[i]=tempArr[j]+a[i];
					
					indexArr[i]=j;
					
					
				}
			}
		}
			
			
	 }	
		int maxIndex =0;
		int max=tempArr[0];
	    for(int i=1;i<tempArr.length;i++){
	        if(max<tempArr[i])
	            max=tempArr[i];
	        maxIndex=i-2;
	        
	        
	    }
	    System.out.println("");
	    System.out.println("max Sum array---------");
		printArr(tempArr);
		System.out.println("\nmax sum is ----------"+max);
//		printArr(indexArr);
//		
////		for (int i =0; i < indexArr.length;i++) {
////			if ()
////		}
//		
//System.out.println(maxIndex);
//             System.out.println("------"+a[maxIndex]);
//				
//			 
	
	
		

//		
	}
	// not efficient , not correct ans for  {1, 101, 2, 3, 100, 4, 5};
	static void subSeqMaxSum(int a[])
	{
		int max = Integer.MIN_VALUE;
		int total =0;
		//System.out.print(a[0]+",");
		int maxNum=0;
		for(int i =0;i<a.length;i++)
		{
			//total+=a[i];
			
			if(maxNum<a[i])
			{
				maxNum=a[i];
				System.out.print(maxNum+",");
				total+=maxNum;
			}
			
			if(total>max)
			{
				max=total;
			}
		}
	    	
		System.out.print(":: max sum: "+max);
	}

	static void printArr(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}

	}
	
	static void maxIncreasingSubSeq(int a[])
	{
		int dp[] = new int[a.length]; 
		
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=a[i];		
		}
		
		for(int i = 1;i<dp.length;i++)
		{
			for(int j = 0;j<i;j++)
			{
				if(a[j]<a[i])
				{
					dp[i]=Math.max(dp[j],dp[j]+a[i]);
				}
			}
		}
		
		int max=0;
		for(int i = 1;i<dp.length;i++)
		{
			if(dp[i]>max) {
				max=dp[i];
				
			}
		}
		
		System.out.println(max);
	}
	
	
	public static void main(String[] args) {
	int[] a= {4,6,1,3,8,4,6};
	int [] b={1, 101, 2, 3, 100, 4, 5};
//		
//		subSeqMaxSum(a);
//		System.out.println("\n");
//		subSeqMaxSum(b);
//		maxSumArray(b);
	maxIncreasingSubSeq(b);
	}

}
