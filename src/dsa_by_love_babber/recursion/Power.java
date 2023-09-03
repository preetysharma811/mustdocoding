package dsa_by_love_babber.recursion;

public class Power {
	
	//complexity : o(n)
	static int powerOf(int a, int b)
	{
		if(b==0) {
			return 1;
		}
		//base condition
//		if(b==1) {
//			return a;
//		}
		return a*powerOf(a,b-1);	
	}

	public static void main(String[] args) {
		
		int a =3;
		int b =3;
		
		System.out.println("powerOf using recursion:" + powerOf(a,b));
		

	}

}
