package dataStructures;

import java.util.ArrayList;

/*
 * Stacks operate under the LIFO principle.
 * 
 * Implemented using ArrayList
 * 
 */
public class JanacStack {
	private ArrayList<String> elems = new ArrayList<>();
	private int top = -1;

	public void push(String s) {
		elems.add(s);
		top++;
	}

	/*
	 * Returns the most recently inputted element.
	 */
	public String pop() {
		String s = null;
		if (top >= 0) {
			s = elems.get(top);
			top--;
		}
		return s;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}

}
