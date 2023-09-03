package string;

public class CheckStringContainsOnlyString {
	
	/// intput qbcdf
	

	public static boolean isHasOnlyletter(String str)
	{
		str=str.toLowerCase();
		for(int i =0;i<str.length();i++)
		{
			int ascii=str.charAt(i);
			if(!(ascii>='a'&&ascii<='z'))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str="abcdEz";
		String str1="abcde123a";
		System.out.println(isHasOnlyletter(str));
		System.out.println(isHasOnlyletter(str1));

	}

}
