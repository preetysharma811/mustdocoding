package string;

import java.util.Arrays;

public class AnangramOrCheckRearranged {

	
	static void isAnagramFirstWay(String s1,String s2) {
		
		s1=s1.toLowerCase().replaceAll("\\s", "");
		s2=s2.toLowerCase().replaceAll("\\s", "");
		if(s1.length()!=s2.length())
		{
			System.out.println("No");
		}
		
		else {
		
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);	
		Arrays.sort(ch2);	
		
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("Yes");
		}
		else {
		System.out.println("No");
		 }
		}
	}
	
	static void isAnagramWithoutArrayUtils(String s1,String s2) {
		char[] ch1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] ch2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();

		
		int[] arr = new int[26];

		if(ch1.length!=ch2.length)
		{
			System.out.println("No");
		}
		else {
		for(int i=0;i<ch1.length;i++)
		{
			int index1 = ch1[i]-97;//ascii = 97
			int index2 = ch2[i]-97;//ascii = 97
			
			arr[index1]++;     //+1
			arr[index2]--;     //if same index then -1 =0
			
		}
	
			boolean status = true;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					status = false;
					break;
				}

			}
			
			if(status==true) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

	public static void main(String[] args) {
		
		isAnagramFirstWay("geeksforgeeks","forgeeksgeeks");
		isAnagramFirstWay("allergy","allergic");
		isAnagramFirstWay("SiLeNt CAT","LisTen AcT");
		isAnagramFirstWay("joy", "enjoy");
		isAnagramFirstWay("ASTRONOMERS", "NO MORE STARS");
		System.out.println("-------------");
		isAnagramWithoutArrayUtils("geeksforgeeks","forgeeksgeeks");
		isAnagramWithoutArrayUtils("allergy","allergic");
		isAnagramWithoutArrayUtils("SiLeNt CAT","LisTen AcT");
		isAnagramWithoutArrayUtils("joy", "enjoy");
		isAnagramWithoutArrayUtils("ASTRONOMERS", "NO MORE STARS");

	}

}
