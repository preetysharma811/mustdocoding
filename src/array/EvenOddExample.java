package array;
import java.util.Scanner;
public class EvenOddExample {
	
	static void checkEvenOdd(int num)
	{
		if (num%2==0) {
			System.out.println(" problem1 - "+num +" is even ");
		}
		else 
		{
			System.out.println(" problem1 - "+num +" is odd ");
		}
	}

	static void printEvenNumbers(int num)
	{
		for(int i=0;i<num;i++)
		if (i%2==0) {
			System.out.println(" problem2 - "+i +" is even ");
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		EvenOddExample.checkEvenOdd(num);
		EvenOddExample.printEvenNumbers(num);
		
	}

}
