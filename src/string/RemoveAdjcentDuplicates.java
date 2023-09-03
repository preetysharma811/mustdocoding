package string;

public class RemoveAdjcentDuplicates {
	//int count=0;
	
	static void removeAdjcentDup(String s) {
		int count = 0;
		for(int i = 0;i<s.length();i++)
		{
			if(i==s.length()-1)
			{
				if(count==0)
				{
					System.out.print(s.charAt(i));
				}
			}
			else {
			if(s.charAt(i)!=s.charAt(i+1))
			{
				if(count==0) {
				System.out.print(s.charAt(i)+",");
				}
				else {
				count=0;
				}
			}
			
			else {
				count++;
			}
		  }
		}
		
		
	}
	
	


	public static void main(String[] args) {
		String s1 = "acaaabbbcdd";
		removeAdjcentDup(s1);
		System.out.println();
		

	}

}
