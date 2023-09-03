package dsa_by_love_babber.basic;

public class CheckAlphanumericWithUpperLowerCase {
	
	static void checkAlphanumericWithUpperLowerCase(char ch)
	{
		// 0 = 48 and 9 =57
		 if(ch>=48&&ch<=57)
		 {
			 System.out.println("given char is number: "+ ch);
		 }
		 
		// A = 65 and Z =90
		 else if(ch>=65&&ch<=90)
		 {
			 System.out.println("given char is Upper Case Alphabet: "+ ch);
		 }
		 
		// a = 97 and z =122
		 else if(ch>=97&&ch<=122)
		 {
			 System.out.println("given char is Lower Case Alphabet: "+ ch);
		 }
		 
		 else {
			 System.out.println("given char is speical char: "+ ch);
		 }
	}

	public static void main(String[] args) {
		
		
		checkAlphanumericWithUpperLowerCase('a');
		checkAlphanumericWithUpperLowerCase('Z');
		checkAlphanumericWithUpperLowerCase('5');
		checkAlphanumericWithUpperLowerCase('%');


	}

}
