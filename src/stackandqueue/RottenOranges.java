package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

//complexity o(n)
class Position {

	int r;
	int c;

	Position(int r, int c) {
		this.r = r;
		this.c = c;
	}
}

public class RottenOranges {

	boolean isValidPosition(int r, int c, int rows, int columns) {
		if (r < 0 || c < 0 || r > rows -1|| c > columns-1) {
			return false;
		}
		return true;
	}

	void findTimeCycleToRot(int a[][], int row, int col) {
			int result = 0;

			Queue<Position> q = new LinkedList<Position>();

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (a[i][j] == 2) {
						q.add(new Position(i, j));
					}
				}
			}

			q.add(null);

			while (!q.isEmpty()) {
				int loopedSum = 0;
				while (q.peek() != null) {
					Position rottenPos = q.poll();
					if (isValidPosition(rottenPos.r + 1, rottenPos.c, row, col)) {
						if(a[rottenPos.r + 1][rottenPos.c] == 1) {
						if (loopedSum == 0) {
							loopedSum = 1;
							result = result + loopedSum;
						}
						a[rottenPos.r + 1][rottenPos.c] = 2;
						q.add(new Position(rottenPos.r + 1, rottenPos.c));
				//		System.out.println((rottenPos.r + 1)+","+rottenPos.c+"="+2);
					  }
					}

					if (isValidPosition(rottenPos.r - 1, rottenPos.c, row, col)){
							if(a[rottenPos.r - 1][rottenPos.c] == 1) {
						if (loopedSum == 0) {
							loopedSum = 1;
							result = result + loopedSum;
						}
						a[rottenPos.r - 1][rottenPos.c] = 2;
						q.add(new Position(rottenPos.r - 1, rottenPos.c));
				//		System.out.println((rottenPos.r - 1)+","+rottenPos.c+"="+2);
					 }
					}

					if (isValidPosition(rottenPos.r, rottenPos.c + 1, row, col)) {
							if(a[rottenPos.r][rottenPos.c + 1] == 1) {
						if (loopedSum == 0) {
							loopedSum = 1;
							result = result + loopedSum;
						}
						a[rottenPos.r][rottenPos.c + 1] = 2;
						q.add(new Position(rottenPos.r, rottenPos.c + 1));
					//	System.out.println(rottenPos.r +","+(rottenPos.c +1)+"="+2);
					  }
					}
					if (isValidPosition(rottenPos.r, rottenPos.c - 1, row, col)){
						 if(a[rottenPos.r][rottenPos.c - 1] == 1) {
						if (loopedSum == 0) {
							loopedSum = 1;
							result = result + loopedSum;
						}
						a[rottenPos.r][rottenPos.c - 1] = 2;
						q.add(new Position(rottenPos.r, rottenPos.c - 1));
					//	System.out.println(rottenPos.r + ", " + (rottenPos.c-1) + "=" + 2);
					  }
					}
					
					
				}
				q.poll();
				
				if(!q.isEmpty())
				{
					q.add(null);
				}
				

			}

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (a[i][j] == 1) {
						result=-1;
					}
				}
			}
			System.out.println("All rotten in timeframe: "+result);
		}

	public static void main(String[] args) {
		RottenOranges rottenOrange = new RottenOranges();

		// 2 | 1 | 0 | 2 | 1
		// 1 | 0 | 1 | 2 | 1
		// 1 | 0 | 0 | 2 | 1
		
		//
//[[2, 1, 0, 2, 1], 
//[2, 0, 1, 2, 1], 
//[1, 0, 0, 2, 1]]

		int arr[][] = { { 2, 1, 0, 2, 1 }, { 1, 0, 1, 2, 1 }, { 1, 0, 0, 2, 1 } };
		int r = 3;
		int c = 5;
		rottenOrange.findTimeCycleToRot(arr, r, c);

	}

}
