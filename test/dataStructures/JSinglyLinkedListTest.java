package dataStructures;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import dataStructures.JSinglyLinkedList;

public class JSinglyLinkedListTest {

	public static JSinglyLinkedList populatedList() {
		JSinglyLinkedList list = new JSinglyLinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		return list;
	}

	@Test
	public void testDelete() throws Exception {
		JSinglyLinkedList list = populatedList();
		list.delete(2);
		Assert.assertEquals("a->b->d->", list.toString());
		list.delete(2);
		Assert.assertEquals("a->b->", list.toString());
	}

	@Test @Ignore //TODO
	public void testRemoveDuplicates() throws Exception {
		JSinglyLinkedList list = populatedList();
		list.add("a");
		System.out.println(list);
		list.removeDuplicates();
		System.out.println(list);
		Assert.assertEquals("a->b->c->d->", list.toString());

	}

	@Test
	public void testReverse() throws Exception {
		JSinglyLinkedList list = populatedList();
		System.out.printf("Before reversal %s\n", list);
		list.reverse();
		System.out.printf("After reversal %s\n", list);

		boolean reversed = list.toString().equals("d->c->b->a->");
		Assert.assertEquals(true, reversed);

	}

}
