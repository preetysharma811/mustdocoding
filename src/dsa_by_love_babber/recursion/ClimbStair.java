package dsa_by_love_babber.recursion;

public class ClimbStair {
	
	// total different ways to reach other step end
	//can take 1 step or 2 steps
	//complexity o(n)
	
	static int noOfWaysClimb(int n)
	{
		//base condition
		if(n==0) {
			return 1;
		}
		
		if(n<0) {
			return 0;
		}

			
		return	noOfWaysClimb(n-1)+noOfWaysClimb(n-2);
		
	}

	public static void main(String[] args) {
		

		
		//
		//          
		//         |
		//---------
		System.out.println("array is sorted:" + noOfWaysClimb(3));
		

	}

}
