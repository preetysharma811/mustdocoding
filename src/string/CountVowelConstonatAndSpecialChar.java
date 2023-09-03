package string;

public class CountVowelConstonatAndSpecialChar {
	
	static boolean checkVowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			return true;
		}
		return false;
	}

	public static void countVowelsNConsonantNSplChar(String str)
	{
		str = str.toLowerCase().replace(" ", "");
		int countVowel = 0;
		int countConsonat = 0;
		int countspl = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c>='a'&&c<='z')
			{
				if(checkVowel(c)) {
				countVowel++;
				}
				
				else {
					countConsonat++;
				}
			}
			else {
				countspl++;
			}
		}
		
		System.out.println("count for vowel="+countVowel);

		System.out.println("count for consonant="+countConsonat);

		System.out.println("count for spl="+countspl);
	}

	public static void main(String[] args) {
		
		String str="abcezii ;super";
		countVowelsNConsonantNSplChar(str);
		System.out.println();


	}

}
