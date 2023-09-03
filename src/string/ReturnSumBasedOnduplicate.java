package string;

public class ReturnSumBasedOnduplicate {
	
	 public static int solution(String S, int[] C) {
	        
	    	int count = 0;
			
			int totalSum=0;
			int distinctSum=0;
			
			int indexfirst= S.indexOf("z");
			int indexLast= S.lastIndexOf("z");
			System.out.println(indexfirst);
			System.out.println(indexLast);
			
		int solution=0;
			
			for(int i =0;i<C.length;i++)
			{
			    totalSum+=C[i];
			    
			    
			}
			
			for(int i = 0;i<S.length();i++)
			{
				if(i==S.length()-1)
				{
					if(count==0)
					{
					//	System.out.print(S.charAt(i));
						distinctSum+=C[i];
					}
				}
				else {
				if(S.charAt(i)!=S.charAt(i+1))
				{
					if(count==0) {
				//	System.out.print(S.charAt(i)+",");
					distinctSum+=C[i];
					}
					else {
				//	System.out.print(S.charAt(i)+",");
					distinctSum+=C[i];
					count=0;
					}
				}
				
				else {
				    solution=+C[i];
					count++;
				}
			  }
			}
			
		return solution;
			
	    }
	


	public static void main(String[] args) {
		String s = "aabbcc";
		int a [] = {1, 2, 1, 2, 1, 2};
		
		System.out.println(solution(s,a));

	}

}
