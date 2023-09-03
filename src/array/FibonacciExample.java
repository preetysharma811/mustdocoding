package array;

public class FibonacciExample {
	
	
	//treat first three number as matrix and power the matrix with number -1
	//  | k(n+1)   k(n)  |
	//  | k(n)     k(n-1)|
	
	static int fibonacciSeriesAtLogNComplexity(int n) {
		 int matrix[][] = new int[][]{{1,1},{1,0}} ;
		 
		 if (n == 0)
		        return 0;
		 
		 power(matrix, n-1);
		
		 return matrix[0][0];	
	}
	
	static void power(int [][] matrix, int n) {
		 if( n == 0 || n == 1)
		      return;
		  
		 int tempMatrix[][] = new int[][]{{1,1},{1,0}};
		 
		 power(matrix,n/2);
		
		 multiple(matrix, tempMatrix);
	}
	
	static void multiple(int [][] matrix, int [][] tempMatrix){
		//a(0,0) a(0,1)         //b(0,0) b(0,1)   
		//a(1,0) a(1,1)         //b(1,0) b(1,1)
		int m00=matrix[0][0]*tempMatrix[0][0] + matrix[0][1]*tempMatrix[1][0];
		int m01=matrix[0][0]*tempMatrix[0][1] + matrix[0][1]*tempMatrix[1][1];
		int m10=matrix[1][0]*tempMatrix[0][0] + matrix[1][1]*tempMatrix[1][0];
		int m11=matrix[1][0]*tempMatrix[0][1] + matrix[1][1]*tempMatrix[1][1];
		
		
		matrix[0][0]=m00;
		matrix[0][1]=m01;
		matrix[1][0]=m10;
		matrix[1][1]=m11;
	}
	
	static int getFibonacciSeries(int n )
	{
		int sum = 0;
		int t1=0;
		int t2=1;
		
		if(n==0)
		{
			return 0;
		}

		System.out.println(t1);
		
		for (int i = 2 ;i <= n ;i++ )
		{
			System.out.println(t2);
			
			sum =t1+t2;
			t1=t2;
			t2=sum;
			
		
		}
		return t2;		
	}

	public static void main(String[] args) {
		 int n=3;
	//	System.out.println(getFibonacciSeries(n));
		
		System.out.println(fibonacciSeriesAtLogNComplexity(n));
		
	}

}
