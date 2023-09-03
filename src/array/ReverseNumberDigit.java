package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Reverse Number Digit
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * 
 */
public class ReverseNumberDigit {
	
    static int reverseDigit(int n) {
    
    	int reverse = 0;
    	while(n>0)
    	{
    		int rem = n%10;
    		reverse = 10*reverse +rem;
    		n = n/10;
    	}
    	
	   	return reverse;
		}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int n = 234;
		 
		System.out.format("reverse of number=%s, is %s", n,ReverseNumberDigit.reverseDigit(n));
     

	}

}
