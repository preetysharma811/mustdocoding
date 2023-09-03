package stackandqueue;

//complexity o(n)
public class CircularTour {
	
	int findCircularTour(int a[])
	{
		int extra=0;
		int diff=0;
		int start = 0;
		
		for(int i = 0; i<a.length-1; i+=2)
		{	
			extra = extra + a[i]-a[i+1];  // diff petrol & distance
			
			if(extra<0) {
				start+=1;
				diff+=extra;
				extra=0;
			}
		}
		
       return extra+diff>=0?start:-1;
	}
    

	
	public static void main(String[] args) {
		CircularTour stack = new CircularTour();
		int a [] = {4, 6, 6, 5, 7, 3, 4, 5};
		int b [] = {1, 3, 2, 4, 3, 5, 4, 1, 5, 2};
		System.out.println(stack.findCircularTour(a));
		System.out.println(stack.findCircularTour(b));
		
	
		

		
	
	}

}
