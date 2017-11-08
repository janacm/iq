package dataStructures;


import static org.junit.Assert.*;

import org.junit.Assert;
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

	@Test
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
		list.reverse();
		boolean reversed = list.toString().equals("d->c->b->a->");
//		System.out.println(reversed);
		assert reversed;
//		System.out.println(list);

	}

}
