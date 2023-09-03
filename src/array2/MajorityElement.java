package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Moore's Voting Algorithm
 * T.C o(N)
 * S.C o(1)
 */
public class MajorityElement {
	
	
	
    static int majorityElement(int a[], int size)
    {
        // your code here
        int counter =1;
        int val = a[0];
        
        for(int i =1; i< a.length;i++)
        {
            if(val == a[i])
            {
                counter++;
                               
            }
            else {
                counter--;
                if(counter==0) {
                val = a[i];
                counter = 1;
                }
            }
        }
       
        return val;
    }
    
    static int isMajority(int a[])
    {
    	int majElement = majorityElement(a,a.length);
    	
        int i, count = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == majElement)
                count++;
        }
        
        if (count > a.length / 2)
            return majElement;
        else
            return -1;
    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,1,3,3,2};
	
		System.out.println(MajorityElement.isMajority(arr));
		
	

	}

}
