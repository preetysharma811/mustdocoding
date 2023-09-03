package pattern;

public class StarPrint {
	
	static void leftBottomTriangle(int n) {
		
		for(int i =0;i<n;i++)
		{
			System.out.println();
			for(int j =i+1;j<=n;j++)
			{
				System.out.print("*");
			}
		}
		
	}
	
static void leftUpTriangle(int n) {
		
		for(int i =0;i<n;i++)
		{
			System.out.println();
			for(int j =0;j<=i;j++)
			{
				System.out.print("*");
			}
		}
		
	}


   void rightBottomTriangle(int n) {
	   for(int i =0;i<n;i++)
		{
			System.out.println();
			for(int j =i+1;j<=n;j++)
			{
				System.out.print("*");
			}
		}
			
	}


   void pryamind() {
	
}

	
	public static void main(String[] args) {
		leftBottomTriangle(5);
		System.out.println("\n-----------------------");
		leftUpTriangle(5);

	}

}
