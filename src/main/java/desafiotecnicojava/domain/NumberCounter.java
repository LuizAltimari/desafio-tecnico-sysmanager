package desafiotecnicojava.domain;

import java.util.Arrays;

public class NumberCounter {
	
	public static int countNumbers(int [] array, int lessThan) {
		int index = 0;
		int result = 0;
		Arrays.sort(array);
		while (array[index] < lessThan) {
			index++;
			result = index;
		}
		
		return result;
	}

}
