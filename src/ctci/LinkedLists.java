package ctci;

import dataStructures.JNode;
import dataStructures.JSinglyLinkedList;
import dataStructures.Node;

public class LinkedLists {

	/*
	 * Returns kth last value, given a linked list.
	 * 
	 * Get size of
	 */
	public String q22_kthToLast(JSinglyLinkedList<String> list, int i) {
		String result = "";
		if ((0 <= i) && (i <= list.size())) {
			result = list.get(list.size() - i);
		}

		return result;
	}

	/*
	 * Deletes a node which is not head nor tail, given only that nodes value. TODO:
	 * complete this method after pulling updated get method
	 */
	public void q23_DeleteMiddleNode(JSinglyLinkedList<String> list, String s) {
		JNode<String> n = new JNode<String>(list.get(2));

	}

	/*
	 * Partition an LL into two unsorted groups:
	 * 
	 * 1) nodes < x , which comes before all
	 * 
	 * 2) nodes >= x , and x itself
	 * 
	 * Strategy:
	 * 
	 * Iterate through the list if less than x, and add them. Iterate again,
	 * checking if greater than x, and add them.
	 * 
	 */
	public JSinglyLinkedList<Integer> q24_partition(JSinglyLinkedList<Integer> list, int x) {
		JSinglyLinkedList<Integer> partitionedList = new JSinglyLinkedList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < x) {
				partitionedList.add(list.get(i));
			}
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= x) {
				partitionedList.add(list.get(i));
			}
		}

		return partitionedList;

	}
}
