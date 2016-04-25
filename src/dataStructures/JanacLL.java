package dataStructures;

/*
* Singly Linked list implementation 
* - stores string values, using a nested node class
* - references to head and tail 

QUESTION
- does tail.next wrap around?
	- if yes, then modify add() 
*/

public class JanacLL {

	Node head;
	Node tail;
	int size = 0;

	/*
	 * Adds an element to the end of the list if its the first element, then set
	 * head and tail to be this element else tail.next = new elem, and tail =
	 * tail.next
	 */
	public void add(String e) {
		if (size == 0) {
			head = new Node(e);
			tail = head;
			size = 1;
		} else {
			tail.next = new Node(e);
			tail = tail.next;
			tail.next = null;
			size++;
		}
	}

	/*
	 * Gets the element at the specified index 1 sets current to head 2 moves to
	 * next elem "index" number of times 3 ex a-b-c-d get(3) abcd c=a, i=0 abcd
	 * c=b, i=1 abcd c=c, i=2 abcd c=d, i=3
	 */
	public String get(int index) {
		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.value;
	}

	/*
	 * Reverses the current list input: a-b-c-d: head=a, t=d
	 * 
	 * output: d-c-b-a, h=d, t=a
	 * 
	 * Idea 1: swap two and repeat on next pair, from beginning to end abcd bacd
	 * bcad bcda //wrong
	 * 
	 * Idea 2: swap two, starting from the end to the beginning (aka: bring the
	 * last element to the front) abcd abdc adbc dabc dacb dcab dcba //correct
	 * :)
	 * 
	 * soln from
	 * http://www.java2blog.com/2014/07/how-to-reverse-linked-list-in-java.html
	 * 
	 * Iterative:
	 * 
	 * 1) Have three nodes i.e previous,current and next
	 * 2) When current is head, previous is null
	 * main loop: 
	 * 3) Assign current.next to previous to reverse the link.
	 * 4) In each iteration move current and previous by 1 node.
	 * 
	 */
	public void reverse() {
		Node previous, current, next;
		current = head;
		previous = null;
		next = current.next;
		while (current.next !=null){
			previous = current.next;
			current = current.next;
		}
	}

	public JanacLL stackReverse() {
		JanacLL reversed = new JanacLL();
		JanacStack j = new JanacStack();
		Node current = head;
		while (current != null) {
			j.push(current.value);
			current = current.next;
		}
		while (!(j.isEmpty())) {
			reversed.add(j.pop());
		}
		return reversed;
	}

	/*
	 * swap the element at the given index, and index+1 1) traverse to i 2)
	 * swappy swap
	 */
	public void swap2(int j) {
		Node current = head;
		for (int i = 0; i < j; i++) {
			current = current.next;
		}

	}

	/*
	 * given two indices, swap the elements in this linked list 1) traverse two
	 * pointers for i and j 2) set i.next = j.next 3) set j.next = i
	 */
	public void swap2(int i, int j) {
		Node elemi;
		Node elemj;

	}

	/*
	 * traverses through the list, until it reaches a null pointer (tail.next)
	 * sample print out: 1->2->3->
	 */
	public String toString() {
		Node current = head;
		String s = "";

		while (current != null) {
			s += current.value + "->";
			current = current.next;
		}
		return s;
	}
}
