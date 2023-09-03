package string;

public class StringPermutation {
	//int count=0;
	
	static void permutation(String s,int i , int n) {
		int j;
		if(i==n)
		{
			System.out.print(s+",");
		}
		else {		
			for(j = i;j<=n;j++)
			{
				  s = swap(s,i,j);
				  permutation(s,i+1,n);
	               s=swap(s,i,j);
			}
			
		}
	}
	
	
	public static String swap(String s ,int i , int j)
	{
		
		char ch[] = s.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp;
               
		return String.copyValueOf(ch);
        
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		permutation(s1,0,s1.length()-1);
		System.out.println();
		String s2 = "aac";
		permutation(s2,0,s2.length()-1);

	}

}
