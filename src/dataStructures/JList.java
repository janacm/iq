package dataStructures;

import patterns.JIterator;

public interface JList<E> {
	JIterator<E> iterator();

	String toString();
	
	int size();
	
	E get(int i);
}
