package string;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class FindIndexForFirstOccurence
{
   static void findIndexOf1(String a)
    {
        int index=-1;
        for(int i =0; i <a.length() ;i++)
        {
           if(a.charAt(i)=='1')
           {
               index=i;
             
           }
        }
         System.out.println(index);
    }
	public static void main(String[] args) {
	String s1 = "000011";
    String s2 = "0000";
    findIndexOf1(s1);
    findIndexOf1(s2);
	}
}
