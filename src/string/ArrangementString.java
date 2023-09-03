package string;

public class ArrangementString {
	
	
	public static int solution(String S) {

		int count = 0;
		int firstOccurance = S.indexOf("R");
		int lastOccurance = S.lastIndexOf("R");

		if (S.length() == 1 && S.charAt(0) == 'W') {
			return -1;

		}

		else if (S.length() == 2) {
			if ((S.charAt(0) == 'W' && S.charAt(1) == 'R') || (S.charAt(0) == 'R' && S.charAt(1) == 'W')) {
				return -1;
			}

		}

		else {
			if (firstOccurance == -1 || lastOccurance == -1) {
				return 0;
			}

			for (int i = firstOccurance; i < lastOccurance; i++) {
				if (S.charAt(i) == 'W') {
					count++;

				}

			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution("RW"));

	}

}
