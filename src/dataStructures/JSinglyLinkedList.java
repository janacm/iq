package dataStructures;

/*
* Singly Linked list implementation 
* - stores string values, using a nested node class
* - references to head and tail 
*/

public class JSinglyLinkedList {

	JNode<String> head;
	JNode<String> tail;
	int size = 0;

	/*
	 * Appends a new element
	 */
	public void add(String e) {
		if (size == 0) {
			head = new JNode<String>(e);
			tail = head;
			size = 1;
		} else {
			tail.next = new JNode<String>(e);
			tail = tail.next;
			tail.next = null;
			size++;
		}
	}

	/*
	 * Deletes the node at d. Assume list is 0 indexed
	 */
	public void delete(int d) {
		JNode<String> temp = head;
		if ((head == null) || (d > size - 1)) {
			return;
		}

		for (int i = 0; i < d - 1; i++) { // a b c
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
	}

	/*
	 * Gets the element at the specified index
	 */
	public String get(int index) {
		JNode<String> current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.value;
	}

	/*
	 * Idea 2: swap two, starting from the end to the beginning (aka: bring the
	 * last element to the front) abcd abdc adbc dabc dacb dcab dcba //correct
	 * :)
	 * 
	 * soln from
	 * http://www.java2blog.com/2014/07/how-to-reverse-linked-list-in-java.html
	 * 
	 * Iterative:
	 * 
	 * 1) Have three nodes i.e previous,current and next 2) When current is
	 * head, previous is null main loop: 3) Assign current.next to previous to
	 * reverse the link. 4) In each iteration move current and previous by 1
	 * node. j=k
	 * 
	 * a>b>c>d p c n a>b>c>d c p n
	 * 
	 */
	public void reverse() {
		JNode<String> previous, current, next;
		current = head;
		previous = null;
		next = current.next;
		while (current.next != null) {
			previous = current.next;
			current = current.next;

			// System.out.println("Current" + current.value);
		}
	}

	public JSinglyLinkedList stackReverse() {
		JSinglyLinkedList reversed = new JSinglyLinkedList();
		JStack j = new JStack();
		JNode<String> current = head;
		while (current != null) {
			j.push(current.value);
			current = current.next;
		}
		while (!(j.isEmpty())) {
			reversed.add(j.pop());
		}
		return reversed;
	}

	public void reverse2() {
		JNode<String> current, next, previous;
		current = head.next;
		previous = head;
		next = current.next;

		while (current.next != null) {
			previous = current.next;
		}
	}

	/*
	 * swap the element at the given index, and index+1 1) traverse to i 2)
	 * swappy swap
	 */
	public void swap2(int j) {
		JNode<String> current = head;
		for (int i = 0; i < j; i++) {
			current = current.next;
		}

	}

	/*
	 * given two indices, swap the elements in this linked list 1) traverse two
	 * pointers for i and j 2) set i.next = j.next 3) set j.next = i
	 */
	public void swap2(int i, int j) {
		JNode<String> elemi;
		JNode elemj;

	}

	/*
	 * traverses through the list, until it reaches a null pointer (tail.next)
	 * sample print out: 1->2->3->
	 */
	public String toString() {
		JNode<String> current = head;
		String s = "";

		while (current != null) {
			s += current.value + "->";
			current = current.next;
		}
		return s;
	}

	/*
	 * Removes duplicates.
	 */
	public void removeDuplicates() {
		if (size < 2)
			return;
	}
}
