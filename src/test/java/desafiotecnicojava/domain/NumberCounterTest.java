package desafiotecnicojava.domain;

import org.junit.Test;

public class NumberCounterTest {
	@Test
	public void countNumbers() {
		int result = NumberCounter.countNumbers(new int [] {5,3,7,1} , 4);
		System.out.println("Number of elements less than 4: " + result);
	}

}
