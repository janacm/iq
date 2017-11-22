package patterns;

import dataStructures.JList;
import dataStructures.JSinglyLinkedList;

public class JIterator<E> implements java.util.Iterator<E> {

	private JList<E> list = new JSinglyLinkedList<E>();
	private int index;

	public JIterator(JList<E> list) {
		super();
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		// return (list.get(index + 1) != null) ? true : false;
		return index < list.size();
	}

	@Override
	public E next() {
		return list.get(index++);
	}

}
