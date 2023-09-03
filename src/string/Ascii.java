package string;

import java.util.Arrays;

public class Ascii {


	public static void main(String[] args) {
		
		String s3 = "abcdefghijklmnopqrstuvwxyz";
		String s4 = "ABCDEFGHIJKMLNOPQRSTUVWXYZ";
		String s5 = "0123456789";
		
		int A ='A';
		int a ='a';
		int zero='0';
		System.out.println("ascci for 'a'="+a+"\nascii for 'A'="+A +"\nascii for '0':"+zero);
		
		System.out.println("--------------------after sub 'a' & 'A' ascii-------");
	
		for(int i =0;i<s3.length();i++) {
			
			int val1=s3.charAt(i)-97;
			int val2=s4.charAt(i)-65;
		
			System.out.println(val1+" & "+val2 );
		}
	
		System.out.println("--------------------after sub zero ascii-------");
        for(int i =0;i<s5.length();i++) {
		int val3=s5.charAt(i)-48;
		System.out.println( "number: " +val3);
		
	}
  }

}