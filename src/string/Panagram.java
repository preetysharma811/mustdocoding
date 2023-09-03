package string;

import java.util.Arrays;

public class Panagram {

	//all english alphabet is present 
	static void isPanagram(String s1) {
		
		s1=s1.toLowerCase().replaceAll("\\s", "");
		char[] ch1 = s1.toCharArray();
		int ar [] = new int[26];
		
		for(int i =0;i<ch1.length;i++)
		{
			int index=ch1[i]-97;
			ar[index]++;
		}
		System.out.println("lenght :"+ar.length);
       boolean status=true;
		for(int i =0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				status=false;
				break;
			}
			
		}
		
		if(!status)
		{
			System.out.println("panagram: No");
		}
		else {

			System.out.println("panagram: Yes");
		}
              
		
	
	}
	
	
	public static void main(String[] args) {
		
		isPanagram("THE QUICK BROWN FOX JUMPS OVER A LAZY DOG");
		
		isPanagram("THE QUICK BROWN");

	}

}
