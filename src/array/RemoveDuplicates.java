package array;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class RemoveDuplicates
{
    
    static void findElementWithoutDuplicate(int a [])
    {
        Map <Integer,Integer> map = new HashMap <Integer,Integer>();
      for (int i = 0 ; i <a.length;i++ )
      {
          if(map.containsKey(a[i]))
          {
             map.put(a[i],map.get(a[i])+1);
          }
          else 
          {
             map.put(a[i],1); 
          }
      }
      
     for(Map.Entry<Integer,Integer> entry: map.entrySet()){
    if( entry.getValue()<2)
    {
         System.out.println(entry.getKey());
    }
         
     }
      
     
    }
    
	public static void main(String[] args) {
	int a [] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
	 findElementWithoutDuplicate(a);
	}
}



