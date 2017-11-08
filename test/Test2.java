

import java.util.HashMap;

import dataStructures.JNode;
import dataStructures.JSinglyLinkedList;
import dataStructures.JStack;
import dataStructures.JTrie;

public class Test2 {
	public static void main(String[] args) throws Exception {
		//		reverseInPlaceTest();
		nodeTesting();
	}

	public static void trie() {
		JTrie j = new JTrie();
		j.add("trie");
		j.add("try");
		String words = j.words();
	}

	public static void nodeTesting() {

		JNode testNode1 = new JNode("1");
		JNode testNode2 = testNode1;
		JNode testNode3 = new JNode("3");
		testNode1 = new JNode("fsdf");
		testNode2.next = testNode3;
		System.out.println(testNode2.next.value); // this should print 3

		JNode currentNode = new JNode("a");
		currentNode.next = new JNode("b");
		currentNode.next.next = new JNode("c");
		currentNode.next.next.next = new JNode("d");
		System.out.println("original: " + currentNode.value + currentNode.next.value + currentNode.next.next.value
				+ currentNode.next.next.next.value);
		currentNode = reverseLinkedList(currentNode);
		System.out.println("reversed: " + currentNode.value + currentNode.next.value + currentNode.next.next.value
				+ currentNode.next.next.next.value);
	}

	public static void caseStatement(String s) {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// line ="";
		// while ( !((line = br.readLine()).equals("")) ){
		// caseStatement(line);
		switch (s) {
		case "janac":
			System.out.println("janac received");
			break;
		case "bobby":
			System.out.println("yaaradi bobbin");
			break;
		case "cow":
			System.out.println("MOOOOOOOO");
			break;
		}
	}

	public static void hashMapTest() {
		HashMap<String, Integer> ages = new HashMap<>();
		HashMap<String, Integer> ages2 = new HashMap<>();
		ages.put("janac", 22);
		ages.put("jimbo", 29);
		ages.put("bonanza", 30);

		ages2.put("janac", 22);
		ages2.put("jimbo", 29);
		ages2.put("bonanza", 30);

		System.out.println(ages.containsKey("janac"));
		String bimbo = "janac";
		System.out.println(ages.get(bimbo));
		System.out.println(ages.values());
		System.out.println(ages.size());
		System.out.println(ages.getOrDefault("farts", 999));
		System.out.println(ages2.equals(ages));
		System.out.println(ages2 == ages);
		ages2 = ages;
		System.out.println(ages2 == ages);
	}

	public static void janacStackTest() {
		JStack j = new JStack();
		j.push("janac");
		j.push("a");
		j.push("b");
		System.out.println(j.pop());
		System.out.println(j.pop());
		System.out.println(j.pop());
	}

	public static JNode reverseLinkedList(JNode currentNode) {
		// For first node, previousNode will be null
		JNode previousNode = null;
		JNode nextNode = currentNode.next;
		System.out.println();
		System.out.println("start initial values:");
		System.out.println("prev: " + previousNode);
		System.out.println("curr: " + currentNode.value);
		System.out.println("next: " + nextNode.value);
		System.out.println("end initial values:");
		System.out.println();

		while (currentNode != null) {
			System.out.println("start");
			currentNode.next = previousNode; // a)

			previousNode = currentNode; // b)
			System.out.println("prev: " + previousNode.value);

			currentNode = nextNode; // c)
			if (currentNode != null) {
				System.out.println("curr: " + currentNode.value);
				nextNode = nextNode.next; // d)
			}
			if (nextNode == null)
				System.out.println("next: " + null);
			else
				System.out.println("next: " + nextNode.value);

			System.out.println("end");
			System.out.println();
		}
		System.out.println(previousNode.value);
		System.out.println(previousNode.next.value);
		System.out.println(previousNode.next.next.value);
		return previousNode;
	}

	public static void reverseInPlaceTest() {
		JSinglyLinkedList l = new JSinglyLinkedList();
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println("original LL: " + l.toString());
		System.out.println("stack reversed LL: " + l.stackReverse().toString());
		l.reverse();
		System.out.println("inplace reversed:" + l.toString());
		// System.out.println(l.get(2));
	}
}