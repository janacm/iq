package dataStructures;

import java.util.ArrayList;

/*
 * Stacks operate under the LIFO principle.
 * 
 * Implemented using ArrayList
 * 
 */
public class JStack {
	private ArrayList<String> elems = new ArrayList<>();
	private int top = -1;

	public void push(String s) {
		elems.add(s);
		top++;
	}

	public String pop() {
		String s = null;
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
