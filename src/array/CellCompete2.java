package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CellCompete2 {
	
	 static List<Integer> finalStates =  new ArrayList<>();
	public List<Integer> cellCompete(int[] states, int days) {
	    List<Integer> currentCellStates = Arrays.stream(states).boxed().collect(Collectors.toList());
	    return getCellStateAfterGivenDays(currentCellStates, days);
	}

	 
	private List<Integer> getCellStateAfterGivenDays(List<Integer> currentCellStates, int days) {
	    List<Integer> changedCellStates = new ArrayList<>();
	    int stateUnoccupied = 0;
	   
		if (days != 0) {
	        for (int i1 = 0; i1 < currentCellStates.size(); i1++) {
	            if (i1 == 0) {
	                changedCellStates.add(getCellState(stateUnoccupied, currentCellStates.get(i1 + 1)));

	            } else if (i1 == 7) {
	                changedCellStates.add(getCellState(currentCellStates.get(i1 - 1), stateUnoccupied));

	            } else {
	                changedCellStates
	                        .add(getCellState(currentCellStates.get(i1 - 1), currentCellStates.get(i1 + 1)));
	            }
	        }
	        if (days == 1) {
	           // System.out.println("days ==1 hit");
	            finalStates = new ArrayList<>(changedCellStates);
	            return finalStates;
	        }
	        days = days - 1;
	       // System.out.println("Starting recurssion");
	        getCellStateAfterGivenDays(changedCellStates, days);
	    }
	    return finalStates;
	}

	private int getCellState(int previousLeft, int previousRight) {
	    if ((previousLeft == 0 && previousRight == 0) || (previousLeft == 1 && previousRight == 1)) {
	        return 0;
	    }
	    return 1;
	}
	

	   public static void main(String[] args) {
		     int arr1[] = { 1, 0, 0, 0, 0, 1, 0, 1 };
		     int arr2[] = { 1, 1, 1, 0, 1, 1, 1, 1 };
		    // int days = 1;
		   CellCompete2 eightHousePuzzle = new CellCompete2();
		   
		    int days1 = 1;
		    int days2 = 2;
		 
		//   System.out.println(eightHousePuzzle.cellCompete(arr1, days1));
		   System.out.println(eightHousePuzzle.cellCompete(arr2, days2));
		}

	// int arr[] = { 1, 1, 1, 0, 1, 1, 1, 1 };

	}

