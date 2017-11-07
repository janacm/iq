package dataStructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class JSinglyLinkedListTest {

	JSinglyLinkedList list = new JSinglyLinkedList();

	public void populateList() {
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
	}

	@Test
	public void testReverse() throws Exception {
		populateList();
		list.reverse();
		boolean reversed = list.toString().equals("d->c->b->a->"); 
		System.out.println(reversed);
		assert reversed; 
		System.out.println(list);

	}

}
