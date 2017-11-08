package ctci;

import dataStructures.JSinglyLinkedList;
import dataStructures.Node;

public class LinkedLists {

	/*
	 * Returns kth last value, given a linked list.
	 * 
	 * Get size of
	 */
	public String q22_kthToLast(JSinglyLinkedList list, int i) {
		String result = "";
		if ( (0 <= i) && (i <= list.size()) ) {
			result = list.get(list.size() - i);
		}

		return result;
	}

	/*
	 * Deletes a node which is not head nor tail, given only that nodes value. 
	 * TODO: complete this method after pulling updated get method
	 */
	public void q23_DeleteMiddleNode(JSinglyLinkedList list, String s) {
//		Node n = list.get(2);
		
	}
	
	/*
	 * Partition an LL such that all nodes < x, come before all nodes >= x 
	 */
	public void q24_partition(JSinglyLinkedList list, String s) {
		Node n = list.head(); 
		JSinglyLinkedList partionedList = new JSinglyLinkedList();
		while (head.next != null) {
			if 
		}

	}
	

}
