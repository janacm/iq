package ctci;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import dataStructures.JSinglyLinkedList;
import dataStructures.Node;

public class LinkedListsTest {

	public JSinglyLinkedList populatedList() {
		JSinglyLinkedList list = new JSinglyLinkedList(); 
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		return list; 
	}

	public JSinglyLinkedList populatedListOfInts() {
		JSinglyLinkedList list = new JSinglyLinkedList(); 
		list.add("1"); 
		list.add("3");
		list.add("4");
		list.add("2");
		list.add("20");
		list.add("142");


//		list.add(1); //TODO 
//		list.add(2);
//		list.add(3);
//		list.add(4);
		return list; 
	}

	@Test
	public void test_22KthLast() throws Exception {
		JSinglyLinkedList list = populatedList();
		LinkedLists llist = new LinkedLists(); 
		Assert.assertEquals("d", llist.q22_kthToLast(list, 1)); 
		Assert.assertEquals("c", llist.q22_kthToLast(list, 2)); 
		Assert.assertEquals("b", llist.q22_kthToLast(list, 3)); 
		Assert.assertEquals("a", llist.q22_kthToLast(list, 4)); 
		Assert.assertEquals("", llist.q22_kthToLast(list, 5)); 
		Assert.assertEquals("", llist.q22_kthToLast(list, -5)); 
	}
	
	@Test @Ignore
	public void test_23DeleteMiddleNode () throws Exception {
		JSinglyLinkedList list = populatedList();
		LinkedLists llist = new LinkedLists(); 
		llist.q23_DeleteMiddleNode(list, "b");
		Assert.assertEquals("a->c->d->", llist.toString()); 
	}
	
	public void test_24PartitionList() throws Exception{
		JSinglyLinkedList list = populatedListOfInts();
		LinkedLists llist = new LinkedLists(); 
		llist.q24_partition(list, "2");
		
		
		
		
	}
}
