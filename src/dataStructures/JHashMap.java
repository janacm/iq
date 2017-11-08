package dataStructures;

import java.util.ArrayList;

public class JHashMap<K, V> {
	K key;
	V value;
	ArrayList<JSinglyLinkedList> g = new ArrayList<JSinglyLinkedList>();

	public JHashMap() {
		for (int i = 0; i < g.size(); i++) {
			g.add(i, new JSinglyLinkedList());
		}

	}

}
