package desafiotecnicojava.domain;

import org.junit.Test;

public class TrainCompositionTest {

	@Test
	public void testTrainComposition() {
		TrainComposition train = new TrainComposition();
		
		//adding wagon 7 on the left
		train.addOnLeft(7);
		//adding more wagons to fill the train
		train.addOnLeft(6);
		train.addOnLeft(4);
		train.addOnLeft(3);
		train.addOnLeft(4);
		train.addOnLeft(5);
		train.addOnLeft(1);
		//adding wagon 13 on the left
		train.addOnLeft(13);
		//removing wagon from the right
		int wagonRemoved = train.removeFromRight();		
		System.out.println("Wagon removed from the right: " + wagonRemoved);
		wagonRemoved = train.removeFromLeft();
		System.out.println("Wagon removed from the left: " + wagonRemoved);
	}
	
}
