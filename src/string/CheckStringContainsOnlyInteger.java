package string;

public class CheckStringContainsOnlyInteger {
	
	/// intput qbcdf
	
	public static boolean isHasOnlyInteger(String str)
	{
		for(int i =0;i<str.length();i++)
		{
			if(!(str.charAt(i)>='0'&&str.charAt(i)<='9'))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str="123459";
		String str1="1234asv";
		System.out.println(isHasOnlyInteger(str));
		System.out.println(isHasOnlyInteger(str1));

	}

}
