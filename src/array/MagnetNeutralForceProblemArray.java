package array;

public class MagnetNeutralForceProblemArray {
	
	static void findNeutralPoint(int [] a)
	{
		
		for(int j = 0; j< a.length-1; j++) {
	
			double start = a[j];
			double end = a[j+1];
			
		while(start<end)
		{
			 double mid = (start + end)/2;
			 double totalForce = 0;
			
			for(int i = 0; i< a.length;i++)
			{
				totalForce+=1/(mid-a[i]);
			}

			if(Math.abs(totalForce)<0.000001)
			{
				System.out.print(String.format("%.2f", mid) + "  , ");
				break;
			}
			if(totalForce<0)
			{
				end = mid;
			}
			else if(totalForce>0)
			{
				start=mid;
			}
		  }
		
		}
	}

	public static void main(String[] args) {
		
       int a [] = {0, 10, 20, 30};
 
       findNeutralPoint(a);
	}

}
