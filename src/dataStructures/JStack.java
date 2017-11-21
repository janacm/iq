package dataStructures;

import java.util.ArrayList;

/*
 * Stacks operate under the LIFO principle.
 * 
 * Implemented using ArrayList
 * 
 */
public class JStack<E> {
	private ArrayList<E> elems = new ArrayList<>();
	private int top = -1;

	public void push(E value) {
		elems.add(value);
		top++;
	}

	public E pop() {
		E s = null;
		if (top >= 0) {
			s = elems.get(top);
			top--;
		}
		return s;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size(){
		int size = top;
		return ++size ; 
	}

}
