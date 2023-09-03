package array;
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
    
   
	 Scanner sc = new Scanner(System.in);
	 int n=Integer.parseInt(sc.nextLine());
     int k=Integer.parseInt(sc.nextLine());
         
            int arr[] = new int[k]; 
         //   String line1 = br.readLine(); 
        //    String[] strs1 = line1.trim().split("\\s+"); 
  
            // array elements input 
            for (int i = 0; i < n; i++)
            {
                if(i<k-1)
                {
                   arr[i] = Integer.parseInt(sc.nextLine()); 
                   System.out.print("-1"+" ");
                }
                else if(i==k-1)
                {
                   arr[i] = Integer.parseInt(sc.nextLine()); 
                   minHeap(arr);
                   System.out.print(arr[0]+" ");
                }
                else
                {
                    int currEle= Integer.parseInt(sc.nextLine()); 
                    if(currEle>arr[0])
                    {
                         arr[0]=currEle;
                         minHeap(arr);
                    }
                    System.out.print(arr[0]+" ");
                }
            }
     
	}
	
	public static void minHeap(int [] arr)
	{
	    int n= arr.length;
	    int size= (n/2);
	   // for(int i=0;i<size;i++)
	   // {
	   //    heapify(arr,n,i);
	   // }
	    for(int i=size-1;i>=0;i--)
	    {
	       heapify(arr,n,i);
	    }
	    //System.out.print(arr[0]+" ");
	   // for(int i=0;i<n;i++)
	   // {
	   // 	int temp =arr[0];
	   // 	arr[0]=arr[n-1-i];
	   // 	arr[n-1-i]=temp;
	   // 	heapify(arr,n-1-i,0);
	   // }
	    
	}
	
	public static void heapify(int [] arr, int maxIndex,int i)
	{
	    int smallest= i;
	    int left= (2*i)+1;
	    int right=(2*i)+2;
	    
	    if(left<maxIndex && arr[left] <arr[smallest])
	        smallest=left;
	   if(right<maxIndex && arr[right] <arr[smallest])
	        smallest=right;
	   
	   if(smallest !=i)
	   {
	       int temp = arr[smallest];
	       arr[smallest]= arr[i];
	       arr[i]=temp;
	       heapify(arr,maxIndex,smallest);
	   }
	}
}