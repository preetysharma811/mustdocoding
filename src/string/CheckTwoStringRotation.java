package string;

public class CheckTwoStringRotation 

{
	static void checkSinglePlaceRotationalString(String s1, String s2) {
	
		if(s1.length()!=s2.length())
		{
			System.out.println("single char rotatation is: No");
		}
		
		else {
		String s1Concatnated= s1.concat(s1);
		//System.out.println(s1Concatnated);
		
		if(s1Concatnated.contains(s2)) {
			System.out.println("single char rotatation is: Yes");
		}
		else {
		System.out.println("single char rotatation is: No");
		 }
		}
	}
	
	

	static void checkRotationByTwoPlaces(String s1, String s2) {
	
		String s3, s4;
		// amazon 
		// s1=amazon
		// s2=azonam
		// clockwise         az  onam --> s2=onamaz  
		// anti-clockwise    azon  am --> s2=amazon
		s3=s2.substring(s2.length()-2)+s2.substring(0,s2.length()-2);
	   // System.out.println(s3);
	    
	    s4=s2.substring(2)+s2.substring(0,2);
	   // System.out.println(s4);
	    if((s1.equals(s3))||(s1.equals(s4))) {
	        System.out.println("yes: rotated by two charaters");
	    }
	
	    else {
	    	 System.out.println("No: rotated by two charaters");
	    }
	}
	
	
      
	
	public static void main(String[] args) {
	String s1 = "ABACD";
	String s2 = "CDABA";
	String s3 = "CDAAB";
	
	String str1 = "amazon";
	String str2 = "azonam";
	
	checkSinglePlaceRotationalString(s1,s2);
	checkSinglePlaceRotationalString(s1,s3);
//	
	checkRotationByTwoPlaces(str1,str2);

	}

}
