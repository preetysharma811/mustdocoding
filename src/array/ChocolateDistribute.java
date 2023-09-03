package array;

import java.util.Arrays;

public class ChocolateDistribute {
	
	
	static int getMax(int a [] , int m)
	{
	  int min = Integer.MAX_VALUE;
      Arrays.sort(a);
      for(int i=0; i<=a.length-m; i++)   {
          if(a[i+m-1]-a[i] < min) {
              min = a[i+m-1]-a[i];
          }
      }
	return min;
	}
	
	public static void main(String[] args) {
		int[] a = {3, 4, 1, 9, 56, 7, 9, 12};
		int[] b = {7, 3, 2, 4, 9, 12, 56};
		int m1 = 5;
		int m2 = 3;
		System.out.println("final result 1------------"+getMax(a,m1));
		System.out.println("final result 2------------"+getMax(b,m2));
		
	}

}
