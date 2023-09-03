package array;

public class MissingNumberInArray {

    public static void findMissingWithSumFormula(int [] array) {
    int n= array.length;
    int lengthArr=n+1;
   int expectedSumArray=lengthArr*(lengthArr+1)/2;
   int actualSumArray=0;
   for (int i=0;i<n;i++)
   {
    actualSumArray=array[i]+actualSumArray;	
   }
   int missingNum=expectedSumArray-actualSumArray;
   System.out.println("expected sum ......"+expectedSumArray);
   System.out.println("actaul sum ......."+ actualSumArray);
   System.out.println("missing number thru sum formula---"+missingNum);
    }
	

    public static void findMissingWithXorFormula(int [] array) {
   int n= array.length;
   int actual = array[0];
   int expected = 1;
   
   for (int i = 2 ; i < array.length+1 ;i++)
   {
	   
   	   
	   expected=expected^i;
	   System.out.println("expected xor -----"+expected);
  }
  
   
    for (int i = 1 ; i < n-1 ;i++)
    {
    	actual=actual^array[i];
    	 System.out.println("actual xor -----"+actual);   
    
   }
   
    
    System.out.println("missing thru xor ......"+ (actual^expected));
    }
    
    
  // for sorted array
    static void binarysearchlogNtime(int a [])
    {
    	int start=0;
    	int end=a.length-1;
    	int mid=0;
    
    	
    	while(end-start>1)
    	{
    	 mid = (end+start)/2;
    	 
    	
    		
    		if(a[start]-start!=a[mid]-mid)
    		{
    			end = mid;
    			
    			
    		}
    		else {
    			start=mid;
    			
    		}
    	 
    		
    	//	mid = Math.abs(end+start)/2;
    	}
    	
    	System.out.println((a[start]+1));
    }
    
    
	public static void main(String[] args) {
	int [] array = {1,2,3,5,6,7};
//	 findMissingWithSumFormula(array);
//	 findMissingWithXorFormula(array);
//     System.out.println("--------------"+(3^5));
     
     binarysearchlogNtime(array);
	}

}
