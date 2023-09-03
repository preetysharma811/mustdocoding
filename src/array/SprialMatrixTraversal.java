package array;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class SprialMatrixTraversal
{
   static void printSpiralTraverse(int a [][], int row, int column)
   {
       int count = 0;
       int left=0;
       int upper=0;
       int right =column-1;
       int bottom =row-1;
      while (count<row*column) {
          
     //tarverse up
      for(int i = left ; i <= right;i++) {
          System.out.print(a[upper][i] + ",");
          count++;
      }
      upper++;
       //tarverse right
       if(count<=row*column){
      for(int i = upper ; i <= bottom;i++){
          System.out.print(a[i][right] + ",");
            count++;
        }
         right--;
       }
     
        //tarverse bottom
       if(count<=row*column){
      for(int i = right ; i >= left;i--){
          System.out.print(a[bottom][i] + ",");
            count++;
        }
         bottom--;
       }
       
          //tarverse left
       if(count<=row*column){
      for(int i = bottom ; i >= upper;i--){
          System.out.print(a[i][left] + ",");
            count++;
        }
         left++;
       }
     }
   }
    
	public static void main(String[] args) {
	    int r=4;
	    int c=4;
	   int input [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	   int a[][]= new int [r][c];
	  int l=0;
	  while(l<input.length-1)
	  {
	     for(int i =0;i<=r-1;i++)
	     {
	    for(int j =0;j<=c-1;j++)
	     {
	       a[i][j]  = input[l];
	       	System.out.print(a[i][j] + " ");
	        l++;
	     } 
	     	System.out.println();
	     }
	  }
	  
	  	System.out.println("PRTING iN SPIRAL");
	    printSpiralTraverse(a,r,c);
	   
	   //o/p 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
	}
}





