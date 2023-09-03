package string;

public class CheckStringIsDistinct {
	
	/// intput qbcdf
	
	public static boolean checkUnique(String str)
	{
		boolean boolArr [] = new boolean[128];
		for (int i =0 ;i<str.length();i++)
		{
			int asciiCode=str.charAt(i);
			//System.out.println(boolArr[asciiCode]);
			if(boolArr[asciiCode]) {
				return false;
			}
			boolArr[asciiCode]=true;
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str="abcdez";
		String str1="abcdea";
		System.out.println(checkUnique(str));
		System.out.println(checkUnique(str1));

	}

}
