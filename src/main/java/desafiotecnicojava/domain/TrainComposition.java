package desafiotecnicojava.domain;

import java.util.Deque;
import java.util.LinkedList;

public class TrainComposition {
	
	private Deque<Integer> composition;
	
	public TrainComposition() {
		this.composition = new LinkedList<Integer>();
	}
	
	public Deque<Integer> getComposition() {
		return composition;
	}

	public void setComposition(Deque<Integer> composition) {
		this.composition = composition;
	}



	public void addOnLeft(int wagon) {
		this.composition.addFirst(wagon);
	}
	
	public void addOnRight(int wagon) {
		this.composition.addLast(wagon);
	}
	
	public int removeFromLeft() {
		return this.composition.removeFirst();
	}
	
	public int removeFromRight() {
		return this.composition.removeLast();
	}

}
