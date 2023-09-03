package array;
import java.util.Scanner;

public class FactorialExample {
	
         static void findFactorial(int num){
        	 int mul=1;
        	 for (int i =num;i>0;i--) {
        		 mul=mul*i;
        	 }
		
        	 System.out.println(mul);
	   }

 	  static int findFactorialWithRecursion(int num)
 	   {
 		   if(num==1)
 		   {
 			   return 1;
 		   }
 		    
 			   return num*findFactorialWithRecursion(num-1);
 	   }
         
		public static void main(String[] args) {
			System.out.println("please enter number ");
			Scanner sc= new Scanner(System.in);
			int num =sc.nextInt();
			FactorialExample.findFactorial(num);
			System.out.println("please enter number ");
			int n =sc.nextInt();
			int fact=FactorialExample.findFactorialWithRecursion(n);
			System.out.println(fact);
			
	}

}
