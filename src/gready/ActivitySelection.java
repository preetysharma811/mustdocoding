package gready;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
	
	//already sorted end time
	static void activitySelctionSoted(int[] start, int end[]){
		
	//	Arrays.sort(end);
		
		int activityCount=1;
		if(start.length==end.length)
		{
			//System.out.println("Activities:");
			System.out.print(start[0]);
			int endTime=end[0];
			
			for(int i=1;i<start.length;i++)
			{			
				if(start[i]>=endTime)
				{
					System.out.print(","+start[i]);
					endTime=end[i];
					activityCount++;
				}
			}
		}
		
		System.out.println("\ntotal activities: "+ activityCount);
		
			
	}
	 
	 class CustomCompare implements Comparator<int[]> {
	        public int compare(int[] a1, int[] a2) {
	            return Integer.compare(a1[1], a2[1]);
	        }
	    }
	 
    static void activitySelctionUnsorted(int[] start, int end[]){
		
    	int comboArray[][] = new int[start.length][2];
    	
    	for(int i = 0 ;i<start.length;i++)
    	{
    		 Arrays.sort(points, new CustomCompare());
        	
    		
    	}
    	
    	//sort the array according to end time
    	
    	for(int i = 0 ;i<comboArray.length;i++) {
    		
    		int s=comboArray[i][0];
    		int e=comboArray[i][1];
    	}
    	
    	for(int i = 0 ;i<start.length;i++)
    	{
    		for(int j = 0 ;j<2;j++)
        	{
    		
    		//	System.out.print(comboArray[i][j] +" ");
    	
        	}	

			//System.out.println();
    	}
    	
    	int endTime = comboArray[0][1];
    	int startTime = comboArray[0][0];
    
    	System.out.println("result");
    	System.out.print(startTime+" ");
    	for(int i=1;i<comboArray.length;i++)
    	{
    		
    		if(comboArray[i][1]>=endTime) {
    			endTime=comboArray[i][1];
    			startTime=comboArray[i][0];
    			System.out.print(startTime+" ");
    		}
    	}
    	
    	
    	//usingPriorityQueue()
    //	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start1[] = {1, 3, 2, 5, 8, 5};
		int end1 [] = {2, 4, 6, 7, 9, 9};
		
		int start2[] = {1, 3, 2, 5};
		int end2[]   = {2, 4, 3, 6};
	
		
		activitySelctionSoted(start1,end1);
		activitySelctionUnsorted(start2,end2);
	}

}
