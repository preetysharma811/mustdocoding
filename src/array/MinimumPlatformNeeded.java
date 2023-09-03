package array;

import java.util.Arrays;

public class MinimumPlatformNeeded {
	
	
	static void minPlatformToavoidCollision(int arival [] , int [] dept)
	{
	
		int min=1;
		int current=1;
		int i=1,j=0;
		
		Arrays.sort(arival);
		Arrays.sort(dept);
		
		 while (i < arival.length && j <  arival.length ) 
		{
			if(dept[j]>=arival[i])
			{
				current++;
				i++;
				if(min<current) {
					min=current;
				}
			}
			else {
				current--;
				j++;
			}
			
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int arrival[] = {900, 940, 950, 1100, 1500, 1800};
		int departure[] = {910, 1200, 1120, 1130, 1900, 2000};
		
		minPlatformToavoidCollision(arrival,departure);
		
		
	
	}

}
