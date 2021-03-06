package dataStructures;

import patterns.JIterator;

/*
* Singly Linked list implementation 
* - stores string values, using a nested node class
* - references to head and tail 
*/

public class JSinglyLinkedList<E> implements JList<E> {

	public JNode<E> head;
	public JNode<E> tail;
	int size = 0;

	
	public JNode<E> head() {
		return this.head; 
	}
	/*
	 * Appends a new element
	 */
	public void add(E elem) {
		if (size == 0) {
			head = new JNode<E>(elem);
			tail = head;
			size = 1;
		} else {
			tail.next = new JNode<E>(elem);
			tail = tail.next;
			tail.next = null;
			size++;
		}
	}

	public int size() {
		return size;
	}

	/*
	 * Deletes the node at d. Assume list is 0 indexed
	 */
	public void delete(int d) {
		JNode<E> temp = head;
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
	public E get(int index) {
		JNode<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.value;
	}

	/*
	 * Reverses the current list input: a-b-c-d: head=a, t=d
	 * 
	 * 
	 * soln from
	 * http://www.java2blog.com/2014/07/how-to-reverse-linked-list-in-java.html
	 * 
	 * Iterative:
	 * 
	 * 1) Have three nodes i.e previous,current and next
	 * 
	 * 2) When current is head, previous is null
	 * 
	 * 3) Main loop: Assign current.next to previous to reverse the link.
	 * 
	 * 4) In each iteration move current and previous by 1 node. j=k
	 * 
	 * ..a>b>c>d>
	 * 
	 * p c n
	 * 
	 * <a b>c>d>
	 * 
	 * .p c n
	 *
	 * a>b>c>d
 	 *
	 * p c n
 	 *
 	 * a>b>c>d
         *
	 * c p n
	 * 
	 * <a<b c>d>
	 * 
	 * ...p c n
	 * 
	 * <a<b<c d>
	 * 
	 * .....p c n
	 * 
	 * <a<b<c<d
	 * 
	 * .......p c n
	 */
	public void reverse() {
		if (size < 2) {
			return;
		}

		JNode<E> previous, current, next;
		current = head;
		previous = null;
		next = current.next;
		while (next != null) {
			current.next = previous;
			previous = current;
			current = next;
			next = next.next;
		}
		current.next = previous;
		previous = current;
		current = next;
		head = previous;

	}

	public JSinglyLinkedList<E> stackReverse() {
		JSinglyLinkedList<E> reversed = new JSinglyLinkedList<E>();
		JStack<E> j = new JStack<E>();
		JNode<E> current = head;
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
	 * Delete a node, without being given head or tail
	 */
	public void deleteMiddleNode(Node n) {
		if (n.next != null) {
			n.value = n.next.value;
			n.next = n.next.next;
		}
	}

	/*
	 * swap the element at the given index, and index+1 1) traverse to i 2) swappy
	 * swap
	 */
	public void swap2(int j) {
		JNode<E> current = head;
		for (int i = 0; i < j; i++) {
			current = current.next;
		}

	}

	/*
	 * given two indices, swap the elements in this linked list 1) traverse two
	 * pointers for i and j 2) set i.next = j.next 3) set j.next = i
	 */
	//TODO
//	public void swap2(int i, int j) {
//		JNode<E> elemi;
//		JNode<E> elemj;
//
//	}

	/*
	 * traverses through the list, until it reaches a null pointer (tail.next)
	 * sample print out: 1->2->3->
	 */
	public String toString() {
		JNode<E> current = head;
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

	@Override
	public JIterator<E> iterator() {
		return new JIterator<>(this);
	}
}
