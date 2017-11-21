package ctci;


import org.junit.Assert;
import org.junit.Test;

import dataStructures.JSinglyLinkedList;

public class LinkedListsTest {
	LinkedLists ll = new LinkedLists();

	@Test
	public void test_q24_partition() throws Exception {
		JSinglyLinkedList<Integer> list = new JSinglyLinkedList<>();

		list.add(3);
		list.add(5);
		list.add(8);
		list.add(5);
		list.add(10);
		list.add(2);
		list.add(1);

		list = ll.q24_partition(list, 5);

		Assert.assertEquals("3->2->1->5->8->5->10->", list.toString());

	}

}
