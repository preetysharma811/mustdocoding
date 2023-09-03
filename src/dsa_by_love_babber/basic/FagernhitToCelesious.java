package dsa_by_love_babber.basic;

public class FagernhitToCelesious {
	
	static void convertFahernhietToCelsious(int f)
	{
		//Formula	
		//(32°F − 32) × 5/9 = 0°C
		
	int celcius = (f-32)*5/9;
	
	System.out.println( f +" farhenheit in celious:"+ celcius );
		
	}

	public static void main(String[] args) {
		
		
		convertFahernhietToCelsious(100);
		

	}

}
