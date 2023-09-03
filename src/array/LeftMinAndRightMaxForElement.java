package array;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class LeftMinAndRightMaxForElement
{
    // all element is smaller and all right side element greater than
    static void leftMinAndRightMax(int a [])
    { int temp =0;
        
        for (int i=1;i<a.length-1 ;i++)
        {
            if(a[i]>a[i-1]&&a[i]<a[i+1])
            {
               temp = a[i]; 
               break;
            }
        }
        if(temp==0)
        
          System.out.println("-1"); 
        
        else
        System.out.println(temp); 
        
    }
    
    
	public static void main(String[] args) {
	int a [] = {4, 3, 2, 7, 8, 9};
	int b [] ={4, 2, 5, 7};
	int c [] ={11, 9, 12};
	 leftMinAndRightMax(a);
	 leftMinAndRightMax(b);
	  leftMinAndRightMax(c);
	
	}
}




