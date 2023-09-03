package array;

public class PythagorasTriplet {
	
	public static boolean checkPythagorasTriplet(int a []  ){
		boolean status = false;
		int temp [] = new int[a.length];
		for(int i = 0 ; i<a.length;i++)
		{
			temp[i]=a[i]*a[i];
		}
		
		for(int i = 0 ; i<a.length-3;i++)
		{
			int aSquare=a[i]*a[i];
			
		  for(int j =1+i;j<a.length-2;j++)
		  {
			  int bSquare=a[j]*a[j];
			  int leftSum = aSquare+bSquare;
			  for(int k =j+1;k<a.length-1;k++)
			  {
			  if(leftSum==temp[k])
			  {
				  System.out.println("a square----------"+aSquare);
				  System.out.println("b square----------"+bSquare);
				  System.out.println("c square----------"+temp[k]);
				  status=true;
				  break;
			  } }
		  }
		}
		
		return status;
		
	}

	public static void main(String[] args) {
		int a[] = {3,2,4,6,5,1};
		System.out.println(checkPythagorasTriplet(a));

	}

}
